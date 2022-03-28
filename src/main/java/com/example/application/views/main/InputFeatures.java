package com.example.application.views.main;

import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
@CssImport("./Halo/halostyles.css")



public class InputFeatures extends HorizontalLayout {
    private  final Buttonadd buttonadd=new Buttonadd();
    public InputFeatures(){
        add(getTabsCheckbox());
    }
    public Div getTabsCheckbox(){
        Tab demo=new Tab("Customer Demo");
        Tab account=new Tab("Customer Account");
        Tab transaction=new Tab("Transaction");
        Tab running=new Tab("Running Acount transaction");

        Tab management=new Tab("Account Transaction");
        Tabs vertical=new Tabs(demo,account,transaction,running,management);udo

        vertical.setOrientation(Tabs.Orientation.VERTICAL);
        vertical.setHeight("230px");
        vertical.setWidth("300px");

        CheckboxGroup<String> checkboxGroup = new CheckboxGroup<>();
        checkboxGroup.setItems("Total Columns", "Continous", "Categorical", "Aggregate","Date");
        checkboxGroup.select("Date", "Continous");
        checkboxGroup.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);

        HorizontalLayout horii=new HorizontalLayout(vertical,checkboxGroup);
        horii.setFlexGrow(2,horii);


      HorizontalLayout horizontalLayout=new HorizontalLayout(horii,buttonadd.getButtons());
      horizontalLayout.getElement().getStyle().set("border","3px solid #F1F4F6").set
              ("border-radius","12px 0px 0px 12px").set("width","1280px").set("height","230px").set
              ("opacity","1").set("top","196px");


      var h2=new H2("Input Features");
        h2.addClassName("h-2");




        Div tabcheck =new Div(new VerticalLayout(h2,horizontalLayout));

         tabcheck.addClassName("tab-check");
         tabcheck.getElement().getStyle().set("background","#FFFFFF 0% 0% no-repeat padding-box").set("width","1500px").set
                 ("height","350px").set("border-radius","14px").set("opacity","1");
         return tabcheck;
    }

}