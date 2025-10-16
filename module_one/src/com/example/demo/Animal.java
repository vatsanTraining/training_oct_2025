package com.example.demo;

// Animal is a sealed class there can be three sub classes 
// of animal Lion,tiger and bear
public sealed class Animal permits Lion,Tiger,Bear{

}
