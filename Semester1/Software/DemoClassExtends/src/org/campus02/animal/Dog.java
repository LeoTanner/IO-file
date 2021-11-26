package org.campus02.animal;

public class Dog
{
    public String eyecolor;
    public int weight;


    public void doSomething()
    {
        System.out.println("This is a dog");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "eyecolor='" + eyecolor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
