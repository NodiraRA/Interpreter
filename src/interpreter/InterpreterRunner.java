/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author nodira
 */
public class InterpreterRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();
        
        System.out.println("Does dveloper knows Java Core:" + isJava.interpret("Java Core"));
        System.out.println("Does dveloper knows Java EE:" + isJavaEEDeveloper.interpret("Java Spring"));
        
    }
    
    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Java Core");
        
        return new OrExpression(java, spring);
    }

    private static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        
        return new AndExpression(java, spring);
    }
    
}
