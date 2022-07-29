package com.ques1;

public class Mobile {

    String[] outdatedModels = {"note4", "note5", "note6", "note7"};

    void searchOutdatedModel(String str, String...strings) {

        for(int i=0; i<outdatedModels.length; i++)
        {
            for(int j=0; j<strings.length; j++)
            {
                if(outdatedModels[i].equals(strings[j]))
                {
                    System.out.println(strings[j]+" OUTDATED");
                }
            }
        }
    }
}
