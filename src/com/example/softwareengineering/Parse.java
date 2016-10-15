package com.example.softwareengineering;
import org.apache.commons.cli.*;
import static com.example.softwareengineering.ArrayofUsers.*;


public class Parse {
    private Options options = new Options();
    private CommandLine cmdline;
    private String[] arg;

    public Parse(String[] arg) {
        options.addOption(new Option("l", "login", true, "Your Login:"));
        options.addOption(new Option("p", "password", true, "Your Password:"));
        options.addOption(new Option("re", "resource", true, "Your Resource:"));
        options.addOption(new Option("ro", "role", true, "Your Role:"));
        options.addOption(new Option("h", "help", false, "Help Information:"));
        this.arg = arg;
    }

    public void ParseCMD() throws ParseException {
        CommandLineParser cmdLinePosixParser = new PosixParser();
        HelpFormatter forhelp = new HelpFormatter();
        ArrayofUsers aou = new ArrayofUsers();
        try {
            cmdline = cmdLinePosixParser.parse(options, arg);
            if (cmdline != null) {
                if (cmdline.hasOption("l")) {
                    aou.setLogin(cmdline.getOptionValue("l"));
                    System.out.println("Login: " + aou.getLogin());
                }

                if (cmdline.hasOption("p")) {
                    aou.setPassword(cmdline.getOptionValue("p"));
                    System.out.println("Password: " + aou.getPassword());
                }

                if (cmdline.hasOption("re")) {
                    aou.setResourse(cmdline.getOptionValue("re"));
                    System.out.println("Resource: " + aou.getResourse());
                }
                if (cmdline.hasOption("ro")) {
                    aou.setRole(cmdline.getOptionValue("ro"));
                    System.out.println("Role: " + aou.getRole());
                }
                if (cmdline.hasOption("h")){
                    printhelp(forhelp);
                }
            } else printhelp(forhelp);
        } catch (ParseException e) {
            printhelp(forhelp);
        }

    }

    private void printhelp(HelpFormatter forhelp) {
        if (cmdline.hasOption("h")||cmdline==null) {
            forhelp.printHelp("HEEELP", "This is help-information", options, "The End");
            System.exit(0);
        }
    }
}

