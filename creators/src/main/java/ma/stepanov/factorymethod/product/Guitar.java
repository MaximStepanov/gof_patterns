package ma.stepanov.factorymethod.product;

public abstract class Guitar {

    public void processPayment() {
        // расчет покупателя
        System.out.println("Покупка оплачена!");
    }

    public void deliver() {
        // оформление и доставка
        System.out.println("Доставка оформлена, ждите заказ в течение 7 дней.");
    }

    public abstract void TPYHbTPYHb();
}
