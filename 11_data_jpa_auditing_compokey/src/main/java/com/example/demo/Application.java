package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.demo.entity.Inventory;
import com.example.demo.entity.LoanApplication;
import com.example.demo.entity.Stock;
import com.example.demo.ifaces.InventoryRepository;
import com.example.demo.ifaces.LoanApplicationRepo;
import com.example.demo.model.Composed;
import com.example.demo.services.StockService;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditBean")
public class Application {

    private final LoanApplicationRepo loanApplicationRepo;

    Application(LoanApplicationRepo loanApplicationRepo) {
        this.loanApplicationRepo = loanApplicationRepo;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(Application.class, args);
		
		
		StockService service = ctx.getBean(StockService.class);
		
		 service.save(ctx.getBean("tvstock",Stock.class));
		 
		 ctx.close();
		
	}

	@Bean
	Stock tvstock() {
		
		return new Stock(10198,"hitachitv", "wakad", 6500);
	}
	
	
	@Bean
	AuditorAware<String> auditBean(){
		
		return () -> Optional.of("Manger");
		}
	
	@Bean
	CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			InventoryRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
				
				repo.save(new Inventory(new Composed("tv","PNQ"),8992));
				
System.out.println("value:====" +repo.findById(new Composed("tv", "CHN")).orElseThrow());
				
			}
		};
		
		
	}
	
	@Bean
	CommandLineRunner keyRunner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			LoanApplicationRepo repo;
			@Override
			public void run(String... args) throws Exception {
				
				
				repo.save(new LoanApplication("Ram"));
				
				repo.save(new LoanApplication("shyam"));

				repo.save(new LoanApplication("kuber"));

				
			}
		};
		
		
	}
	
}
