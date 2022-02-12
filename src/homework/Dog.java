package homework;

public class Dog {
    private String name;
    private final int DEFAULT_APPETITE=25;
    private int remains;
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //создадим метод для пугания кота
    public void scare(Cat cat){
       // System.out.println("Dog " +name+ " scare (пугает) cat");

        //чтобы метод "пугать" мог указывать кокретного кота добавим аргумент (ссылка на объект Cat) в скобки метода

        System.out.println("Dog " +name+ " scare (пугает) cat "+cat.getName());
        cat.fear(this);//собака отдает в метод себя, поэтому this
    }


    public void eat(Plate plate){
        remains=DEFAULT_APPETITE-plate.getFood();//остаток недостающий для насыщения
        if (DEFAULT_APPETITE<= plate.getFood()){
            plate.decreseFood(DEFAULT_APPETITE); //метод который уменьшает количество еды food на количество еды потребляемое котом (константу)
            System.out.println("Dog "+name+" eat... я сытый");}
        else if(DEFAULT_APPETITE> plate.getFood()){
            System.out.println("Dog "+name+ " говорит: я не сытый, В тарелке мало еды, не хватает еще "+remains);
        }
    }

}
