package homework;

public class Main {

    public static void main(String[] args) {


        //создадим кота и научим есть из тарелки (класс Cat и Класс Plate)

        //создаем тарелку обозначаем ее емкость и полностью заполняем едой
        Plate plate = new Plate(80);

        //создадим массив котов

        Cat cats[]=new Cat[6];
        cats[0] = new Cat("Barsik");
        cats[1] = new Cat("Musya");
        cats[2] = new Cat("Sima");
        cats[3] = new Cat("Phenya");
        cats[4] = new Cat("Boris");
        cats[5] = new Cat("Ryzhik");

        //массиву котов скажем поесть
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

// создадим собаку Тузика
        Dog Tuzik=new Dog("Tuzik");
        Dog Bim=new Dog("Bim");

        //Тузик отпугнул последнего в массиве кота
        Tuzik.scare(cats[5]);


        //добавим еды в тарелку
        plate.AddFood(30);
        // кормим тузика
        Tuzik.eat(plate);
        //кормим Бима
        Bim.eat(plate);



//dog.scare(cat);
//теперь даем коту поеесть из тарелки
//cat.eat(plate);
//        //объект plate( экземпляр класса Plate) вызывает метод setFood (метод для изменения переменной)
//        //метод setFood() принимает переменную класса Plate (вызываем ее через точкку обращаясь через объект plate к методу getFood()
//        //вычитаем 10 ( условно приняли 10-это насыщение кота)
//        plate.setFood(plate.getFood() - 10);
//        //проверяем что количество еды из полной тарелки уменьшилось со 100 до 90
//        System.out.println(plate.getFood());


        //теперь каждый раз когда кот будет есть нужно прописывать это в методе Main, потому что связи между классами Plate и Cat нет! это неудобно
// нужно сразу учесть что если кот ест, количество еды должно уменьшаться автоматически

        //доработаем класс Кот
//добавляем собаку (кот боится собаку)

    }
}
