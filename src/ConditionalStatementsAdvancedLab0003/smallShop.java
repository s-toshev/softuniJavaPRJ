package ConditionalStatementsAdvancedLab0003;

import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double qty = Double.parseDouble(scanner.nextLine());

        double totalCost=0;

        if (city.equals("Sofia"))
            if(product.equals("coffee")){
                totalCost=qty*0.50;
                System.out.println(totalCost);
            }else if(product.equals("water")){
                totalCost=qty*0.80;
                System.out.println(totalCost);
            }else if(product.equals("beer")){
                totalCost=qty*1.20;
                System.out.println(totalCost);
            }else if(product.equals("sweets")){
                totalCost=qty*1.45;
                System.out.println(totalCost);
            }else if(product.equals("peanuts")){
                totalCost=qty*1.60;
                System.out.println(totalCost);
            }
        if (city.equals("Plovdiv"))
                if(product.equals("coffee")){
                    totalCost=qty*0.40;
                    System.out.printf("%.2f",totalCost);
                }else if(product.equals("water")){
                    totalCost=qty*0.70;
                    System.out.printf("%.2f",totalCost);
                }else if(product.equals("beer")){
                    totalCost=qty*1.15;
                    System.out.printf("%.2f",totalCost);
                }else if(product.equals("sweets")){
                    totalCost=qty*1.30;
                    System.out.printf("%.2f",totalCost);
                }else if(product.equals("peanuts")){
                    totalCost=qty*1.50;
                    System.out.printf("%.2f",totalCost);
                }

        if(city.equals("Varna"))
                    if(product.equals("coffee")){
                        totalCost=qty*0.45;
                        System.out.printf("%.2f",totalCost);
                    }else if(product.equals("water")){
                        totalCost=qty*0.70;
                        System.out.printf("%.2f",totalCost);
                    }else if(product.equals("beer")){
                        totalCost=qty*1.10;
                        System.out.printf("%.2f",totalCost);
                    }else if(product.equals("sweets")){
                        totalCost=qty*1.35;
                        System.out.printf("%.2f",totalCost);
                    }else if(product.equals("peanuts")){
                        totalCost=qty*1.55;
                        System.out.printf("%.2f",totalCost);
                    }
    }
}
