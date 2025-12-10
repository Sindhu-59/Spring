package com.xworkz.internet;

import com.xworkz.internet.config.CoreConfig;
import com.xworkz.internet.javaApp.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoreRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfig.class);

        Internet internet = applicationContext.getBean(Internet.class);
        //internet.setId(1);
        //internet.setName("JIO");
        System.out.println(internet);

        Vegetables veg = applicationContext.getBean(Vegetables.class);
        veg.setColor("Red");
        veg.setName("Tomato");
        System.out.println(veg);

        Hospital hos = applicationContext.getBean(Hospital.class);
        hos.setId(2);
        hos.setName("Tomato");
        System.out.println(hos);

        Vehicle veh=applicationContext.getBean(Vehicle.class);
        veh.setId(3);
        veh.setName("car");
        System.out.println(veh);

        NailPolish nail=applicationContext.getBean(NailPolish.class);
        nail.setBrand("Dotand key");
        nail.setColor("red");
        System.out.println(nail);

        Chocolate chocolate=applicationContext.getBean(Chocolate.class);
        chocolate.setBrand("Cadbury");
        chocolate.setName("Temptation");
        System.out.println(chocolate);

        Bag bag= applicationContext.getBean(Bag.class);
        bag.setName("Puma");
        bag.setId(2);
        System.out.println(bag);

        Cloth cloth=applicationContext.getBean(Cloth.class);
        cloth.setBrand("H&M");
        cloth.setName("Top");
        System.out.println(cloth);

        AmusementPark park=applicationContext.getBean(AmusementPark.class);
        park.setName("Mariyappan palya");
        park.setId(56);
        System.out.println(park);

        Hero hero=applicationContext.getBean(Hero.class);
        hero.setName("Pawan Kalyan");
        hero.setIndustry("Tollywood");
        System.out.println(hero);

        Company company=applicationContext.getBean(Company.class);
        company.setName("Cognizant");
        company.setLocation("Bangalore");
        System.out.println(company);

        Home home=applicationContext.getBean(Home.class);
        home.setLocation("Shimoga");
        home.setId(67);
        System.out.println(home);

        SocialMedia socialMedia=applicationContext.getBean(SocialMedia.class);
        socialMedia.setName("Instagram");
        socialMedia.setUseful(false);
        System.out.println(socialMedia);

        Jet jet=applicationContext.getBean(Jet.class);
        jet.setLocation("Bng");
        jet.setName("Indigo");
        System.out.println(jet);

        District district=applicationContext.getBean(District.class);
        district.setLocation("delhi");
        district.setMovieName("Athadu");
        System.out.println(district);

        Chair chair=applicationContext.getBean(Chair.class);
        chair.setId(79);
        chair.setBrand("Kodak");
        System.out.println(chair);

        Laptop laptop=applicationContext.getBean(Laptop.class);
        laptop.setBrand("HP");
        laptop.setOs("WindowsOs");
        System.out.println(laptop);

        Poster poster=applicationContext.getBean(Poster.class);
        poster.setColor("Red");
        poster.setSize("4*4");
        System.out.println(poster);

        Mobile mobile=applicationContext.getBean(Mobile.class);
        mobile.setBrand("Samsung");
        mobile.setPrice(71000.00);
        System.out.println(mobile);

        Camera camera=applicationContext.getBean(Camera.class);
        camera.setId(34);
        camera.setName("Nikon");
        System.out.println(camera);

        Radio radio=applicationContext.getBean(Radio.class);
        radio.setName("Radio mirchi");
        radio.setId(45);
        System.out.println(radio);

        Bank bank=applicationContext.getBean(Bank.class);
        bank.setName("HDFC");
        bank.setId(22);
        System.out.println(bank);

        Food food=applicationContext.getBean(Food.class);
        food.setName("Chitrana");
        food.setPrice(30.00);
        System.out.println(food);

        Gym gym=applicationContext.getBean(Gym.class);
        gym.setId(23);
        gym.setName("JJ");
        System.out.println(gym);

        Sandal sandal=applicationContext.getBean(Sandal.class);
        sandal.setBrand("Lunar");
        sandal.setColor("Green");
        System.out.println(sandal);

        Perfume perfume=applicationContext.getBean(Perfume.class);
        perfume.setBrand("Bellavita");
        perfume.setFlavor("lavender");
        System.out.println(perfume);

        Watch watch=applicationContext.getBean(Watch.class);
        watch.setBrand("Titan");
        watch.setId(5);
        System.out.println(watch);

        Novel novel=applicationContext.getBean(Novel.class);
        novel.setName("Maleyali madumagalu");
        novel.setAuthor("Kuvempu");
        System.out.println(novel);
    }
}
