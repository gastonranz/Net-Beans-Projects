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
public class Posnet {
    private boolean encendido;
    private boolean apagado;
    private boolean credit;
    private boolean debit;
    private int cuotas;
    private int recargo;
    public float date = Posnet.dateIncrement;
    public static float dateIncrement = (float)05.26;
    //POR MAS QUE INICIALICE 10 O LOS OBJETOS NUEVOS QUE SEAN, EL VALOR DEL ATRIBUTO
    //"STATIC" SIEMPRE SE INICIALIZARÁ 1 SOLA VEZ, LUEGO SIN IMPORTAR LA CANT. DE OBJETOS
    //QUE INICIALICE, SIEMPRE ESE OBJETO OBTENDRÁ EL VALOR DEL ATRIBUTO ESTÁTICO ACTUALIZADO.
    //NO SE VUELVE A INICIALIZAR UN ATRIBUTO ESTÁTICO NUNCA, PORQUE PERTENECE A LA CLASE, NO A
    //UN OBJETO. NO DEBO CONFUNDIR CONCEPTOS.
    private int ticketNumber = Posnet.ticketIncrement;
    private static int ticketIncrement = 0;
    private boolean purchaseConfirm;
    private final CreditCard card;//Inicializarlo con datos.
    private static final String factory = "Ranz";
    private String ticket;
    
    public Posnet(CreditCard card) {
        this.card = card;
    }
    
    public void encender() {
        this.encendido = true;
    }
    
    public void apagar() {
        this.apagado = true;
    }
    
    public void efectuarPago(float monto) {
            if(this.encendido == true && this.apagado == false) {
                //InputStreamReader keyboardCapture = new InputStreamReader(System.in);
                //BufferedReader buffer = new BufferedReader(keyboardCapture);
                //System.out.println("Presiona 1 para cobrar, 0 para salir:");
                //String strNum = buffer.readLine();
                //Integer num = Integer.parseInt(strNum);

    //            Scanner input = new Scanner(System.in);
                System.out.println("Press 1 for \"Debit Card\", 2 for \"Credit Card\", 0 to quit:");
                String strNum = new Scanner(System.in).nextLine();
                Integer num = Integer.parseInt(strNum);
                while(num != 1 && num != 2 && num != 0) {
                    System.out.println("Please, press 1 for \"Debit Card\", 2 for \"Credit Card\", 0 to quit:");
                    strNum = new Scanner(System.in).nextLine();
    //                strNum = input.nextLine();
                    num = Integer.parseInt(strNum);
                }
                if(num == 1) {
                        System.out.println("You've chosen \"Debit Card\"");
                        this.debit = true;
                } else if(num == 2) {
                        System.out.println("You've chosen \"Credit Card\"");
                        this.credit = true;
                } else {
                        System.out.println("Thank you for using this Posnet System " + Posnet.factory + " Company.");
                }
                
                if(this.debit == true && this.credit == false) {
                    System.out.println("Press 1 to confirm the purchase, press 2 to go back, press 0 to quit:");
                    strNum = new Scanner(System.in).nextLine();
                    num = Integer.parseInt(strNum);
                    
                    while(num != 1 && num != 2 && num != 0) {
                        System.out.println("Please, press 1 to confirm the purchase, press 2 to go back, press 0 to quit:");
                        strNum = new Scanner(System.in).nextLine();
                        num = Integer.parseInt(strNum);
                    }
                    
                    if(num == 1) {
                        this.card.saldoTarjeta(monto, this.purchaseConfirm);
                        if(this.purchaseConfirm == true) {
                            this.ticket = this.ticketDebit(monto);
                        } else {
                            this.ticket = this.ticketDebitNull();
                        }
                        this.debit = false;
                    } else if(num == 2) {
                        this.efectuarPago(monto);
                        this.debit = false;
                    } else {
                        System.out.println("Thank you for using this Posnet System " + Posnet.factory + " Company.");
                        this.debit = false;
                    }
                }

                if(this.credit == true && this.debit == false) {
                    System.out.println("Choose the number of Cuotas:\"Press 1 to 1 cuota, press 2 to 2 cuotas, press 3 to 3 cuotas, press 4 to 4 cuotas, press 5 to 5 cuotas, press 6 to 6 cuotas, press 7 to go back, press 0 to quit:");
                    strNum = new Scanner(System.in).nextLine();
                    num = Integer.parseInt(strNum);

                    while(num != 1 && num != 2 && num != 3 && num != 4 && num != 5 && num != 6 && num != 7 && num != 8) {
                        System.out.println("Please, choose the number of Cuotas:\"Please, press 1 to 1 cuota, press 2 to 2 cuotas, press 3 to 3 cuotas, press 4 to 4 cuotas, press 5 to 5 cuotas, press 6 to 6 cuotas, press 7 to go back, press 0 to quit:");
                        strNum = new Scanner(System.in).nextLine();
                        num = Integer.parseInt(strNum);
                    }

                    if(num == 7) {
                        this.efectuarPago(monto);
                        this.credit = false;
                    } else if(num == 0) {
                        System.out.println("Thank you for using this Posnet System " + Posnet.factory + " Company.");
                        this.credit = false;
                    } else {
                        if(num == 1) {
                            this.cuotas = 1;
                        } else if(num == 2) {
                            this.cuotas = 2;
                        } else if(num == 3) {
                            this.cuotas = 3;
                        } else if(num == 4) {
                            this.cuotas = 4;
                        } else if(num == 5) {
                            this.cuotas = 5;
                        } else if(num == 6) {
                            this.cuotas = 6;
                        }
                    }
                    
                    if(this.cuotas == 1 || this.cuotas == 2 || this.cuotas == 3 || this.cuotas == 4 || this.cuotas == 5 || this.cuotas == 6) {
                        System.out.println("Press 1 to confirm the purchase, press 2 to go back, press 0 to quit:");
                        strNum = new Scanner(System.in).nextLine();
                        num = Integer.parseInt(strNum);

                        while(num != 1 && num != 2 && num != 0) {
                            System.out.println("Please, press 1 to confirm the purchase, press 2 to go back, press 0 to quit:");
                            strNum = new Scanner(System.in).nextLine();
                            num = Integer.parseInt(strNum);
                    }
                        
                    if(num == 1) {
                        if(this.cuotas == 1) {
                            this.recargo = 0;
                            this.purchaseConfirm = this.card.saldoTarjeta(monto, this.purchaseConfirm, recargo);
                            if(this.purchaseConfirm == true) {
                                this.ticket = this.ticketCredit(monto);
                            } else {
                                this.ticket = this.ticketCreditNull();
                            }
                            this.credit = false;
                        } else if(this.cuotas == 2) {
                            this.recargo = 3;
                            this.purchaseConfirm = this.card.saldoTarjeta(monto, purchaseConfirm, recargo);
                            if(this.purchaseConfirm == true) {
                                this.ticket = this.ticketCredit(monto);
                            } else {
                                this.ticket = this.ticketCreditNull();
                            }
                            this.credit = false;
                        } else if(this.cuotas == 3) {
                            this.recargo = 6;
                            this.purchaseConfirm = this.card.saldoTarjeta(monto, this.purchaseConfirm, this.recargo);
                            if(this.purchaseConfirm == true) {
                                this.ticket = this.ticketCredit(monto);
                            } else {
                                this.ticket = this.ticketCreditNull();
                            }
                            this.credit = false;
                        } else if(this.cuotas == 4) {
                            this.recargo = 9;
                            this.purchaseConfirm = this.card.saldoTarjeta(monto, this.purchaseConfirm, this.recargo);
                            if(this.purchaseConfirm == true) {
                                this.ticket = this.ticketCredit(monto);
                            } else {
                                this.ticket = this.ticketCreditNull();
                            }
                            this.credit = false;
                        } else if(this.cuotas == 5) {
                            this.recargo = 12;
                            this.purchaseConfirm = this.card.saldoTarjeta(monto, this.purchaseConfirm, this.recargo);
                            if(this.purchaseConfirm == true) {
                                this.ticket = this.ticketCredit(monto);
                            } else {
                                this.ticket = this.ticketCreditNull();
                            }
                            this.credit = false;
                        } else if(this.cuotas == 6) {
                            this.recargo = 15;
                            this.purchaseConfirm = this.card.saldoTarjeta(monto, this.purchaseConfirm, this.recargo);
                            if(this.purchaseConfirm == true) {
                                this.ticket = this.ticketCredit(monto);
                            } else {
                                this.ticket = this.ticketCreditNull();
                            }
                            this.credit = false;
                        }
                    } else if(num == 2) {
                        this.efectuarPago(monto);
                        this.credit = false;
                    } else {
                        System.out.println("Thank you for using this Posnet System " + Posnet.factory + " Company.");
                        this.credit = false;
                        }
                    }
                }
            }
    }
    
    private String ticketCredit(float monto) {
        this.date = Posnet.dateIncrement;
        Posnet.ticketIncrement++;
        this.ticketNumber = Posnet.ticketIncrement;
        String ticket = "----TICKET---- Num: " + this.ticketNumber + "\n Purchase Date: " + this.date + "\nCard Purchase: Credit.\n----Customer----\n" + this.card.ticketPersonData() + "\nMonto Total: " + (monto + this.recargo) + "\nCantidad Cuotas: " + this.cuotas + "\nMonto de cada Cuota: " + (monto + this.recargo / this.cuotas);
        Posnet.dateIncrement += (float)00.01;
        return ticket;
    }
    
    private String ticketCreditNull() {
        this.date = Posnet.dateIncrement;
        Posnet.ticketIncrement++;
        this.ticketNumber = Posnet.ticketIncrement;
        String ticket = "----Ticket---- Num: " + this.ticketNumber + "\n Purchase Date: " + this.date + "\nCard Purchase: Credit.\n----Customer----\n" + this.card.ticketPersonData(null, null) + "\nMonto Total: " + null + "\nCantidad Cuotas: " + null + "\nMonto de cada Cuota: " + null;
        Posnet.dateIncrement += (float)00.01;
        return ticket;
    }
    
    private String ticketDebit(float monto) {
        this.date = Posnet.dateIncrement;
        Posnet.ticketIncrement++;
        this.ticketNumber = Posnet.ticketIncrement;
        String ticket = "----TICKET---- Num: " + this.ticketNumber + "\n Purchase Date: " + this.date + "\nCard Purchase: Debit.\n----Customer----\n" + this.card.ticketPersonData() + "\nMonto Total: " + monto;
        Posnet.dateIncrement += (float)00.01;
        return ticket;
    }
    
    private String ticketDebitNull() {
        this.date = Posnet.dateIncrement;
        Posnet.ticketIncrement++;
        this.ticketNumber = Posnet.ticketIncrement;
        String ticket = "----Ticket---- Num: " + this.ticketNumber + "\n Purchase Date: " + this.date + "\nCard Purchase: Debit.\n----Customer----\n" + this.card.ticketPersonData(null, null) + "\nMonto Total: " + null;
        Posnet.dateIncrement += (float)00.01;
        return ticket;
    }
    
    public void money28() {
        this.card.moneyIncrement();
    }
    
    public String getTicket() {
        return this.ticket;
    }
    
    public String getSaldo() {
        return this.card.getSaldo();
    }

    @Override
    public String toString() {
        return "Posnet{" + "date=" + date + ", numTicket=" + ticketNumber + ", card=" + card + '}';
    }
}
