package com.sasha.lesson14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1");
        Set<Human> humanSet = new HashSet<>();
        int[] ageArray = new int[]{20, 23, 35, 14};
        String[] nameArray = new String[]{"Stepan", "Tolik", "Ira", "Oleg"};
        for (int i = 0; i < ageArray.length; i++){
            humanSet.add(new Human(ageArray[i], nameArray[i]));
        }
        System.out.println("Set before sorting: " + humanSet);
        Set<Human> humanSetSorted = new TreeSet<>(humanSet);
        System.out.println("Set after sorting(age): " + humanSetSorted);
        TreeSet<Human> tree_set = new TreeSet<>(new MyComparator());
        for (int i = 0; i < ageArray.length; i++){
            tree_set.add(new Human(ageArray[i], nameArray[i]));
        }
        System.out.println("Set after sorting(name): " + tree_set);

        System.out.println("Task2");
        LinkedHashSet<Commodity> commoditySet = new LinkedHashSet<>();
        int action;
        String name;
        int length;
        int width;
        int weight;
        while (true){
            System.out.println("1.Додати товар");
            System.out.println("2.Видалити товар");
            System.out.println("3.Замінити товар");
            System.out.println("4.Сортувати за назвою");
            System.out.println("5.Сортувати за довжиною");
            System.out.println("6.Сортувати за шириною");
            System.out.println("7.Сортувати за вагою");
            System.out.println("8.Виводимо і-тий елемент колекції");
            System.out.println("9. Вийти з програми");
            System.out.println("Уведіть дію");
            action = scanner.nextInt();
            switch (action){
                case 1:
                    System.out.println("Уведіть назву товару");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("Уведіть довжину товару");
                    length = scanner.nextInt();
                    System.out.println("Уведіть ширину товару");
                    width = scanner.nextInt();
                    System.out.println("Уведіть вагу товару");
                    weight = scanner.nextInt();
                    commoditySet.add(new Commodity(name, length, width, weight));
                    System.out.println("Товар додано");
                    break;
                case 2:
                    System.out.println("Уведіть назву товару");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("Уведіть довжину товару");
                    length = scanner.nextInt();
                    System.out.println("Уведіть ширину товару");
                    width = scanner.nextInt();
                    System.out.println("Уведіть вагу товару");
                    weight = scanner.nextInt();
                    if(commoditySet.remove(new Commodity(name, length, width, weight))){
                        System.out.println("Товар видалено");
                    } else {
                        System.out.println("Товар не видалено");
                    }
                    break;
                case 3:
                    System.out.println("Уведіть інформацію старого товару");
                    System.out.println("Уведіть назву  товару");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("Уведіть довжину товару");
                    length = scanner.nextInt();
                    System.out.println("Уведіть ширину товару");
                    width = scanner.nextInt();
                    System.out.println("Уведіть вагу товару");
                    weight = scanner.nextInt();
                    Commodity commodity1 = new Commodity(name, length, width, weight);
                    if(commoditySet.remove(commodity1)){
                        System.out.println("Товар видалено");
                        System.out.println("Уведіть інформацію нового товару");
                        System.out.println("Уведіть назву товару");
                        scanner.nextLine();
                        name = scanner.nextLine();
                        System.out.println("Уведіть довжину товару");
                        length = scanner.nextInt();
                        System.out.println("Уведіть ширину товару");
                        width = scanner.nextInt();
                        System.out.println("Уведіть вагу товару");
                        weight = scanner.nextInt();
                        commoditySet.add(new Commodity(name, length, width, weight));
                    } else {
                        System.out.println("Товар не замінено");
                    }
                    break;
                case 4:
                    Set<Commodity> commodities = new TreeSet<>(MyComparatorCommodity.SORT_BY_NAME);
                    Iterator<Commodity> iterator = commoditySet.iterator();
                    while (iterator.hasNext()){
                        commodities.add(iterator.next());
                    }
                    commoditySet.clear();
                    iterator=commodities.iterator();
                    while (iterator.hasNext()){
                        commoditySet.add(iterator.next());
                    }
                    System.out.println(commoditySet);
                    break;
                case 5:
                    Set<Commodity> commodities1 = new TreeSet<>(MyComparatorCommodity.SORT_BY_LENGTH);
                    Iterator<Commodity> iterator1 = commoditySet.iterator();
                    while (iterator1.hasNext()){
                        commodities1.add(iterator1.next());
                    }
                    commoditySet.clear();
                    iterator1=commodities1.iterator();
                    while (iterator1.hasNext()){
                        commoditySet.add(iterator1.next());
                    }
                    System.out.println(commoditySet);
                    break;
                case 6:
                    Set<Commodity> commodities2 = new TreeSet<>(MyComparatorCommodity.SORT_BY_WIDTH);
                    Iterator<Commodity> iterator2 = commoditySet.iterator();
                    while (iterator2.hasNext()){
                        commodities2.add(iterator2.next());
                    }
                    commoditySet.clear();
                    iterator2=commodities2.iterator();
                    while (iterator2.hasNext()){
                        commoditySet.add(iterator2.next());
                    }
                    System.out.println(commoditySet);
                    break;
                case 7:
                    Set<Commodity> commodities3 = new TreeSet<>(MyComparatorCommodity.SORT_BY_WEIGHT);
                    Iterator<Commodity> iterator3 = commoditySet.iterator();
                    while (iterator3.hasNext()){
                        commodities3.add(iterator3.next());
                    }
                    commoditySet.clear();
                    iterator2=commodities3.iterator();
                    while (iterator2.hasNext()){
                        commoditySet.add(iterator3.next());
                    }
                    System.out.println(commoditySet);
                    break;
                case 8:
                    System.out.println("Уведіть номер елемента");
                    int index = scanner.nextInt();
                    int i=0;
                    int counter=0;
                    Iterator<Commodity> iterator4 = commoditySet.iterator();
                    while (iterator4.hasNext()){
                        if(i==index){
                            System.out.println(iterator4.next());
                            counter++;
                            break;
                        } else {
                            i++;
                            counter++;
                            iterator4.next();
                        }
                    }
                    if (counter!=0){
                        System.out.println("Something bad has happened");
                    }
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid data");
                    break;
            }
        }
    }
}