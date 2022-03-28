package com.example.application.views.main;

import com.vaadin.flow.component.button.Button;

import com.vaadin.flow.component.button.ButtonVariant;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
@CssImport("./Halo/halostyles.css")




public class Buttonadd extends HorizontalLayout {
    public Buttonadd() {
        add(getButtons());

    }

    public Div getButtons() {


        Button phonenumber = new Button("Phone number");
        phonenumber.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        phonenumber.getElement().getStyle().set("border-radius","25px");

        Button pincode = new Button("Pincode");
        pincode.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        pincode.getElement().getStyle().set("border-radius","25px");

        Button accountNumber = new Button("Account number");
        accountNumber.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        accountNumber.getElement().getStyle().set("border-radius","25px");

        Button dob = new Button("DOB");
        dob.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        dob.getElement().getStyle().set("border-radius","25px");

        Button location = new Button("Location");
        location.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        location.getElement().getStyle().set("border-radius","25px");

        Button gender = new Button("Gender");
        gender.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        gender.getElement().getStyle().set("border-radius","25px");


        Button type = new Button("Type");
        type.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        type.getElement().getStyle().set("border-radius","25px");


        Button age = new Button("Age");
        age.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        age.getElement().getStyle().set("border-radius","25px");


        Button monthly = new Button("Monthly Balance");
        monthly.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        monthly.getElement().getStyle().set("border-radius","25px");

        Button loanrepay = new Button("Loan Repayment");
        loanrepay.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        loanrepay.getElement().getStyle().set("border-radius","25px");


        Button identity = new Button("Customer ID");
        identity.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        identity.getElement().getStyle().set("border-radius","25px");

        Button loanre = new Button("Loan Created Date");
        loanre.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        loanre.getElement().getStyle().set("border-radius","25px");




        VerticalLayout pin = new VerticalLayout(phonenumber, pincode, accountNumber);
    VerticalLayout gen = new VerticalLayout(location, gender, type);
        VerticalLayout mon = new VerticalLayout(age, monthly, loanrepay);
        VerticalLayout dobb = new VerticalLayout(identity, loanre, dob);
        HorizontalLayout buttonss=new HorizontalLayout(pin,gen,mon,dobb);
        buttonss.setFlexGrow(1,buttonss);


        Div buttondiv = new Div();
        buttondiv.add(buttonss);


        buttondiv.addClassName("button-div1");

        return buttondiv;
    }
}