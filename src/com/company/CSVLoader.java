package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVLoader {

    private String filepath = "./Files/CRComponent.csv";
    private BufferedReader bufferedReader = null;
    private String line = "";
    private String csvsplitby = ",";
    private ArrayList<String[]> csvDataList = new ArrayList<>();

    public CSVLoader(){

        try{
            bufferedReader = new BufferedReader(new FileReader(filepath));
            while((line = bufferedReader.readLine()) != null){

                String[] csvDataSet = line.split(csvsplitby);

                csvDataList.add(csvDataSet);

            }
        } catch ( IOException e){
            e.printStackTrace();
        }

    }

    private void stringArrayReader(String[] array){
        for(String s : array){
            System.out.print(s+", ");
        }
        System.out.println();
    }

    public void showData(){
        for(String[] a : csvDataList){
            stringArrayReader(a);
        }
    }

    public ArrayList<String[]> getCsvDataList() {
        return csvDataList;
    }
}
