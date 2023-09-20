package org.example.adapter;

public class FancyUIService {
    public void displayMenus(JsonData jsonData){
        System.out.println(jsonData.getData()+"menus");
    }
    public void displayRecommendations(JsonData jsonData){
        System.out.println(jsonData.getData()+"recomms");
    }
}
