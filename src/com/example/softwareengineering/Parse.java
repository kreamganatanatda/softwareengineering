package com.example.softwareengineering;

import org.apache.commons.cli.*;


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

        try {
            cmdline = cmdLinePosixParser.parse(options, arg);
            if (cmdline != null) {
                if (cmdline.hasOption("l")) {
                    String[] arguments = cmdline.getOptionValues("l");
                    System.out.println("Login: " + arguments[0]);
                }

                if (cmdline.hasOption("p")) {
                    String[] arguments = cmdline.getOptionValues("p");
                    System.out.println("Password: " + arguments[0]);
                }

                if (cmdline.hasOption("re")) {
                    String[] arguments = cmdline.getOptionValues("re");
                    System.out.println("Resource: " + arguments[0]);
                }
                if (cmdline.hasOption("ro")) {
                    String[] arguments = cmdline.getOptionValues("ro");
                    System.out.println("Role: " + arguments[0]);
                }
            } else printhelp(forhelp);
        } catch (ParseException e) {
            printhelp(forhelp);
        }

    }

    private void printhelp(HelpFormatter forhelp) {
        if (cmdline.hasOption("h")) {
            forhelp.printHelp("HEEELP", "This is help-information", options, "The End");
            System.exit(0);
        }
    }
}

