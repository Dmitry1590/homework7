package homework;

public class Plate {
    private int foodconst;//вместимость еды в тарелку
    private int food;//текущая еда
    private int addfood;//добавляема еда


    public Plate(int foodconst) {
        this.foodconst = foodconst;
        System.out.println("Тарелка вмещает " + foodconst + ", сейчас она полна");
        food=foodconst;
    }

//    public void setFood(int food) {
//        this.food = food;
//    }
    //вместо сеттера setFood() создадим метод для уменьшения количества еды в тарелке

    //в ДЗ создать метод который добавляет в тарелку еду

    public int decreseFood(int amount) {

        if (food < amount) System.out.println("В тарелке мало еды, пополните пожалуйста");
        else if (amount <= 0) {
            System.out.println("Нельзя кормить количеством еды <=0, попробуйте еще раз");
        } else {
            food -= amount;
            System.out.println("Еды уменьшилось на " + amount + " В тарелке осталось: " + food);
        }
return food;
        //в ДЗ прописать проверку для отрицательных чисел
    }

    public int getFood() {
        return food;
    }


    public void AddFood(int addfood) {
        if (addfood + food > foodconst) {
            System.out.println("Нельзя положить еды в тарелку больше чем: " + foodconst);
        } else if (addfood <= 0) {
            System.out.println("Нельзя положить количеством еды <=0, попробуйте еще раз");
        } else {
            food = addfood + food;
            System.out.println("Хозяин добавил в тарелку " + addfood + " еды, теперь  в ней " + food + " еды");
        }
    }
}

