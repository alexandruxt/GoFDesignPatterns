package org.example.adapter;

public class MultiRestoApp implements IMultiRestoApp{

    @Override
    public void displayMenus(XmlData xmlData) {
        System.out.println(xmlData.getData()+"menus");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        System.out.println(xmlData.getData()+"recomms");
    }
}
