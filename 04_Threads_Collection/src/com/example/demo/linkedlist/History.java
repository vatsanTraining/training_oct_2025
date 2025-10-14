package com.example.demo.linkedlist;
import java.util.LinkedList;

public class History {

	    private LinkedList<String> history;
	    private int currentIndex;

	    public History(String homepage) {
	        history = new LinkedList<>();
	        history.add(homepage);
	        currentIndex = 0;
	    }

	    public void visit(String url) {
	        while (history.size() > currentIndex + 1) {
	            history.removeLast();
	        }
	        history.add(url);
	        currentIndex++;
	    }

	    public String back(int steps) {
	        currentIndex = Math.max(0, currentIndex - steps);
	        return history.get(currentIndex);
	    }

	    public String forward(int steps) {
	        currentIndex = Math.min(history.size() - 1, currentIndex + steps);
	        return history.get(currentIndex);
	    }

	    public void printHistory() {
	        System.out.println("Browser History:");
	        for (int i = 0; i < history.size(); i++) {
	            System.out.print(history.get(i));
	            if (i == currentIndex) {
	                System.out.print(" (Current)");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        History browser = new History("https://www.google.com");
	        browser.visit("https://www.youtube.com");
	        browser.visit("https://www.facebook.com");
	        browser.visit("https://www.twitter.com");
	        browser.printHistory();

	        System.out.println("\nGoing back 2 steps:");
	        System.out.println("Current URL: " + browser.back(2));
	        browser.printHistory();

	        System.out.println("\nGoing forward 1 step:");
	        System.out.println("Current URL: " + browser.forward(1));
	        browser.printHistory();

	        System.out.println("\nVisiting a new page:");
	        browser.visit("https://www.instagram.com");
	        browser.printHistory();

	        System.out.println("\nGoing back 5 steps (more than available):");
	        System.out.println("Current URL: " + browser.back(5));
	        browser.printHistory();
	    }
	
}
