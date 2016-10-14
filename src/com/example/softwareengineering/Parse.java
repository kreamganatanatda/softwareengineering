package com.example.softwareengineering;
import org.apache.commons.cli.*;


public class Parse {
   private Options options = new Options();

    public Parse()
    {
        options.addOption(new Option("l","login",true,"Your Login:"));
        options.addOption(new Option("p","password",true,"Your Password:"));
        options.addOption(new Option("re","resource",true,"Your Resource:"));
        options.addOption(new Option("ro","role",true,"Your Role:"));
        options.addOption(new Option("h","help",false,"Help Information:"));
    }

}
