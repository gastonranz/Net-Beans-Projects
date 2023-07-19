/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioIntegrador;

import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class CreditCard {
    private String entity;
    private String entidadBancaria;
    private String cardNumber;
    private float saldo;
//    private float moneyGet;
    private Person person;
    
    public CreditCard(String entidadBancaria, Person person) {
        this.entitySelection();
        this.entidadBancaria = entidadBancaria;
        this.cardNumber();
        this.saldo = 0;
        this.person = person;
    }
    
    public CreditCard(Person person) {
        this("Brubank", person);
    }
    
    private void cardNumber() {
        int max = 10;
        int min = 1;
        double resultado = Math.floor(Math.random() * (max - min + 1) + min);
        if(resultado == 1) {
            this.cardNumber = "4234 0928 0923 2983";
        } else if(resultado == 2) {
            this.cardNumber = "1234 0982 8234 0001";
        } else if(resultado == 3) {
            this.cardNumber = "8293 0293 1238 0943";
        } else if(resultado == 4) {
            this.cardNumber = "0293 1111 8392 9999";
        } else if(resultado == 5) {
            this.cardNumber = "2222 3333 4444 7777";
        } else if(resultado == 6) {
            this.cardNumber = "2299 0011 9393 2727";
        } else if(resultado == 7) {
            this.cardNumber = "0010 0020 0030 0080";
        } else if(resultado == 8) {
            this.cardNumber = "9876 5432 1234 8378";
        } else if(resultado == 9) {
            this.cardNumber = "9090 6060 1212 2828";
        } else {
            this.cardNumber = "1001 2002 3003 6006";
        }
    }
    
    private void entitySelection() {
        int min = 1;
        int max = 2;
        double result = Math.floor(Math.random() * (max - min + 1) + min);
        if(result == 1) {
            this.entity = "Visa";
        } else {
            this.entity = "Master Card";
        }
    }
    
    public void depositar() {
        System.out.println("Press 1 to deposit, press 0 to quit:");
        int num = new Scanner(System.in).nextInt();
        
        while(num != 1 && num != 0) {
            System.out.println("Please, press 1 to deposit, press 0 to quit:");
            num = new Scanner(System.in).nextInt();
        }
        
        if(num == 1) {
            System.out.println("Type the number of money you want: ");
            float numFloat = new Scanner(System.in).nextFloat();
            
            while(numFloat < 0) {
                System.out.println("Please type a positive number: ");
                numFloat = new Scanner(System.in).nextFloat();
            }
            
            if(numFloat == 0) {
                while(numFloat <= 0) {
                    System.out.println("Please, type a value bigger than \"0\": ");
                    numFloat = new Scanner(System.in).nextFloat();
                }
                
                System.out.println("Your Deposit was successed. Your last Saldo was: " + this.saldo +
                        "\nYou've Deposited: " + numFloat + "\nYour Saldo is: " + (this.saldo + numFloat));
                this.saldo += numFloat;
            } else {
                System.out.println("Your Deposit was successed. Your last Saldo was: " + this.saldo +
                        "\nYou've Deposited: " + numFloat + "\nYour Saldo is: " + (this.saldo + numFloat));
                this.saldo += numFloat;
            }
        } else {
            System.out.println("Your Deposit was Canceled.");
        }
    }
    
    public void extraer() {
        float moneyGet = 0;
        
        System.out.println("Hello. Press 1 to get $100, press 2 to get $300, press 3 to get $500,"
                + " press 4 to get $1.000, press 5 to get $2.000, press 5 to get $5.000, press 7 to get $10.000, press 0 to quit.");
            int num = new Scanner(System.in).nextInt();
            
            while(num != 1 && num != 2 && num != 3 && num!= 4 && num != 5 && num != 6 && num != 7 && num != 0) {
                System.out.println("Please, Press 1 to get $100, press 2 to get $300, press 3 to get $500,"
                + " press 4 to get $1.000, press 5 to get $2.000, press 5 to get $5.000, press 7 to get $10.000, press 0 to quit.");
                num = new Scanner(System.in).nextInt();
            }
            
            if(num == 1) {
                moneyGet = (float)100;
            } else if(num == 2) {
                moneyGet = (float)300;
            } else if(num == 3) {
                moneyGet = (float)500;
            } else if(num == 4) {
                moneyGet = (float)1000;
            } else if(num == 5) {
                moneyGet = (float)2000;
            } else if(num == 6) {
                moneyGet = (float)5000;
            } else if(num == 7) {
                moneyGet = (float)10000;
            }
            
            if(num != 0) {
                System.out.println("Press 1 to confirm, press 2 to go back, press 0 to quit");
                num = new Scanner(System.in).nextInt();
                
                while(num != 1 && num != 2 & num != 0) {
                    System.out.println("Please, Press 1 to confirm, press 2 to go back, press 0 to quit");
                    num = new Scanner(System.in).nextInt();
                }
                
                if(num == 2) {
                    moneyGet = 0;
                    this.extraer();//Ejecuto este método nuevamente mientras se termina de ejecutar el método y luego imprime todos los valores juntos cuando termina el método.
                } else if(num == 0) {
                    moneyGet = 0;
                }
            }
            
            if(this.saldo >= moneyGet && moneyGet > 0) {
                System.out.println("Your Saldo is " + this.saldo + " - Your're just about to extract: " + moneyGet + " - \nYour Saldo will be set up to: " + (this.saldo - moneyGet) +
                        "\nPlease type 1 to confirm, press 2 to go back, press 0 to quit.");
                num = new Scanner(System.in).nextInt();
            
                while(num != 1 && num != 2 && num != 0) {
                    System.out.println("Please, type 1 to confirm the Extract Operation, press 2 to go back, press 0 to quit");
                    num = new Scanner(System.in).nextInt();
                }

                if(num == 1) {
                    this.saldo -= moneyGet;
                    System.out.println("Your extraction was successfull.\n- Your saldo is: " + this.saldo + " -");
                } else if(num == 2) {
                    this.extraer();
                } else {
                    System.out.println("Your extraction was Canceled. Thank you, have a nice day.");
                } 
            } else if (this.saldo < moneyGet && num != 0) {
                System.out.println("You don't have enough money to do this extraction.");
            } else if(moneyGet == 0 && num == 0) {
                System.out.println("Thank you, have a nice day.");
            }
    }
    
    public boolean saldoTarjeta(float monto, boolean purchaseConfirm, int recargo) {
        if(recargo == 0 && monto >= 0 && this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println("You've got a new item! Congratulations!");
            System.out.println();
            purchaseConfirm = true;
        } else if(recargo == 3 && monto >= 0 && this.saldo >= monto + (recargo * monto / 100)) {
            this.saldo -= monto + (recargo * monto / 100);
            System.out.println("You've got a new item! Congratulations!");
            System.out.println();
            purchaseConfirm = true;
        } else if(recargo == 6 && monto >= 0 && this.saldo >= monto + (recargo * monto / 100)) {
            monto += recargo * monto / 100;
            this.saldo -= monto + (recargo * monto / 100);
            System.out.println("You've got a new item! Congratulations!");
            System.out.println();
            purchaseConfirm = true;
        } else if(recargo == 9 && monto >= 0 && this.saldo >= monto + (recargo * monto / 100)) {
            this.saldo -= monto + (recargo * monto / 100);
            System.out.println("You've got a new item! Congratulations!");
            System.out.println();
            purchaseConfirm = true;
        } else if(recargo == 12 && monto >= 0 && this.saldo >= monto + (recargo * monto / 100)) {
            monto += recargo * monto / 100;
            this.saldo -= monto;
            System.out.println("\"You've got a new item! Congratulations!");
            System.out.println();
            purchaseConfirm = true;
        } else if(recargo == 15 && monto >= 0 && this.saldo >= monto + (recargo * monto / 100)) {
            this.saldo -= monto + (recargo * monto / 100);
            System.out.println("\"You've got a new item! Congratulations!");
            System.out.println();
            purchaseConfirm = true;
        } else if(this.saldo < monto + (recargo * monto / 100)) {
            System.out.println("You don't have enough money in your card.\n"
                    + "Your Saldo is: " + this.saldo + ". You need at least " + (monto + (recargo * monto / 100) - this.saldo) + " At least.");
        } else {
            System.out.println("Please, type a positive monto number.");
        }
        return purchaseConfirm;
    }
    
    public boolean saldoTarjeta(float monto, boolean purchaseConfirm) {
        if(this.saldo >= monto && monto >= 0) {
            this.saldo -= monto;
            System.out.println("Congratulations, you've got a new item!");
            purchaseConfirm = true;
        } else if(this.saldo < monto && monto >= 0) {
            System.out.println("You don't have enough money in your card. \n"
                    + "Your saldo is: " + this.saldo + ". You need at least: " + (monto - this.saldo));
        } else {
            System.out.println("Please, type a positive monto number.");
        }
        return purchaseConfirm;
    }
    
    public void personData() {
        this.person.personData();
    }
    
    public String ticketPersonData() {
        return this.person.ticketPersonData();
    }
    
    public String ticketPersonData(String name, String lastName) {
        return this.person.ticketPersonData(name, lastName);
    }
    
    public void moneyIncrement() {
        this.saldo = 2000;
    }

    public String getSaldo() {
        return "Your Saldo is: " + this.saldo;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "entity=" + entity + ", entidadBancaria=" + entidadBancaria + ", cardNumber=" + cardNumber + ", saldo=" + saldo + ", person=" + person + '}';
    }
}
