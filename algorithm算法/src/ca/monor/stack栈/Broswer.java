package ca.monor.stack栈;

import java.util.Scanner;

public class Broswer {
    private Scanner scanner;
    private String url;
    private Stack<String> back;
    private Stack<String> foward;

    public Broswer() {
        this.back = new Stack<>();
        this.foward = new Stack<>();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        goToPage();
    }

    private void goToPage() {
        String currentUrl = "";
        while (true) {
            System.out.print("type a url.... (type x to exit) :");
            String command = scanner.nextLine();
            if (command.equals("x")) {
                return;
            } else if (command.equals("b")) {
                if (!back.isEmpty()) {
                    foward.push(currentUrl);
                    currentUrl = back.pop();
                    show(currentUrl);
                } else {
                    System.out.println("No site to back");
                }
            } else if (command.equals("f")) {
                if (!foward.isEmpty()) {
                    back.push(currentUrl);
                    currentUrl = foward.pop();
                    show(currentUrl);
                } else {
                    System.out.println("No site to fowared");
                }
            } else if (!command.contains(".")) {
                System.out.println("Wrong url.....");
            } else {
                foward.clear();
                currentUrl = command;
                back.push(currentUrl);
                show(currentUrl);
            }
        }
    }

    private void show(String url) {
        System.out.println("Broswering site: " + url);
    }

    public static void main(String[] args) {
        Broswer broswer = new Broswer();
        broswer.start();
    }

}
