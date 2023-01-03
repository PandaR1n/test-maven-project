package Home_work_2;
public class Discounts_shirts {
    private static final int priceOneShirt = 1500;
    public static final int  numberShirts = 3;
    public static final int  quantityShirtsDiscount = 5;
    private static final float discount = 30.5F;

    public static void main(String[] args) {

        int buyInAddition = quantityShirtsDiscount - numberShirts;
        int totalPriceShirts = priceOneShirt * numberShirts;
        int priceOfPurchasedShirts = priceOneShirt * buyInAddition;
        int priceOfAllShirts = priceOneShirt * quantityShirtsDiscount;
        float savedMoney = priceOfAllShirts * discount / 100;
        float discountShirts = priceOfAllShirts - savedMoney;
        float discountShirtPrice = discountShirts / quantityShirtsDiscount;
        int freeShirt = (int) (savedMoney / priceOneShirt);
//        BigDecimal  freeShirt = new BigDecimal(savedMoney / priceOneShirt).setScale(0, RoundingMode.DOWN);

        System.out.println("количество выбранных рубашек = " + numberShirts);
        System.out.println("сколько рубашек купить для скидки = " + quantityShirtsDiscount);
        System.out.println("докупить рубашек = " + buyInAddition);
        System.out.println("общая цена выбранных рубашек = " + totalPriceShirts);
        System.out.println("цена докупленных рубашек = " + priceOfPurchasedShirts);
        System.out.println("цена всех рубашек = " + priceOfAllShirts);
        System.out.println("сэкономленные деньги = " + savedMoney);
        System.out.println("цена рубашек со скидкой = " + discountShirts);
        System.out.println("цена одной рубашки со скидкой = " + discountShirtPrice);
        System.out.println("халява = " + freeShirt);
    }
}