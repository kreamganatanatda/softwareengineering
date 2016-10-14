package com.example.softwareengineering;
import org.apache.commons.cli.*;


public class Parse {
    private Options options = new Options();
    private CommandLine cmdline;

    public Parse()
    {
        options.addOption(new Option("l","login",true,"Your Login:"));
        options.addOption(new Option("p","password",true,"Your Password:"));
        options.addOption(new Option("re","resource",true,"Your Resource:"));
        options.addOption(new Option("ro","role",true,"Your Role:"));
        options.addOption(new Option("h","help",false,"Help Information:"));
    }

    public void ParseCMD(String[] arg) throws Exception{
        //Создаём парсер командной строки
        CommandLineParser cmdLinePosixParser = new PosixParser();
        //Парсинг
        cmdline = cmdLinePosixParser.parse(options, arg);

        if (cmdline.hasOption("l")) {
            String[] arguments = cmdline.getOptionValues("l");
            System.out.println("Login: " + arguments[0]);
        }
        if (cmdline.hasOption("p")){}
        if (cmdline.hasOption("re")){}
        if (cmdline.hasOption("ro")){}
        HelpFormatter forhelp = new HelpFormatter();
        if (cmdline.hasOption("h")){}
    }
}
