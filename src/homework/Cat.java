package homework;

public class Cat {
    private String name;
    //обозначим насыщение кота константой
    private final int DEFAULT_APPETITE=15;
    private int remains;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate){
        remains=DEFAULT_APPETITE-plate.getFood(); //остаток недостающий для насыщения
        if (DEFAULT_APPETITE<= plate.getFood()){
            plate.decreseFood(DEFAULT_APPETITE); //метод который уменьшает количество еды food на количество еды потребляемое котом (константу)
       // plate.setFood(plate.getFood() - DEFAULT_APPETITE);
        //метод сеттер лучше не использовать чтобы не было возможности изменять количество еды в тарелке, уберем из класса Plate сеттеры
        //нужно просто создать методы добавить еды и убавить еды, а вместимость тарелки=CONST
        System.out.println("Cat "+name+" eat... я сытый");}
        else if(DEFAULT_APPETITE> plate.getFood()){
            System.out.println("Cat "+name+ " говорит: я не сытый, В тарелке мало еды, не хватает еще "+remains);
        }
    }

    //добавим метод "бояться собак"

    public void fear(Dog dog){
        System.out.println("Cat "+name+" fear dog "+dog.getName());
    }
}
