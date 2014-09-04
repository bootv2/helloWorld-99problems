/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworldapplication;

/**
 *
 * @author tim
 */
public class HelloWorldApplication 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");//print hello world
        
        for(int i = 1; i < 100; i++)//count up to 100, and print "Got + count + problems but a bitch aint one"
            System.out.println("Got " + i + " problems, but a bitch ain't one");
    }
    
}
