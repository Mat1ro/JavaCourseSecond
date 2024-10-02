public class Car extends Transport {
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
