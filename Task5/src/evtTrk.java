public class evtTrk extends sbj {
    public void userReg(String username) {
        System.out.println("пользователь зарегистрировался: " + username);
        notifyObs("регистрация", "пользователь " + username + " зарегистрировался");
    }

    public void item(String username, String productname) {
        System.out.println("пользователь оформил заказ: " + productname);
        notifyObs("заказ", "пользователь " + username + " заказал: " + productname);
    }
}
