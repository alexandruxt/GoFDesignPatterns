package org.example;

import org.example.abstractFactory.Company;
import org.example.abstractFactory.Gpu;
import org.example.abstractFactory.Monitor;
import org.example.abstractFactory.MsiManufacturer;
import org.example.adapter.FancyUIServiceAdapter;
import org.example.adapter.XmlData;
import org.example.bridge.AmericanRestaurant;
import org.example.bridge.ItalianRestaurant;
import org.example.bridge.PepperoniPizza;
import org.example.bridge.VeggiePizza;
import org.example.builder.*;
import org.example.chainOfResponsibility.*;
import org.example.command.Light;
import org.example.command.LivingRoom;
import org.example.command.Room;
import org.example.command.SwitchLightsCommand;
import org.example.composite.Book;
import org.example.composite.CompositeBox;
import org.example.composite.DeliveryService;
import org.example.composite.VideoGame;
import org.example.decorator.DiscordDecorator;
import org.example.decorator.INotifier;
import org.example.decorator.Notifier;
import org.example.decorator.WhatsAppDecorator;
import org.example.facade.BuyCryptoFacade;
import org.example.factoryMethod.BeefBurgerRestaurant;
import org.example.factoryMethod.Burger;
import org.example.factoryMethod.Restaurant;
import org.example.interpreter.Expression;
import org.example.interpreter.OrExpression;
import org.example.interpreter.TerminalExpression;
import org.example.iterator.DepthFirstIterator;
import org.example.iterator.Vertex;
import org.example.mediator.LoginButton;
import org.example.memento.Editor;
import org.example.observer.EmailMsgListener;
import org.example.observer.Event;
import org.example.observer.MobileAppListener;
import org.example.observer.Store;
import org.example.prototype.VehicleCache;
import org.example.proxy.ProxyVideoDownloader;
import org.example.proxy.VideoDownloader;
import org.example.singleton.Singleton;
import org.example.state.Phone;
import org.example.strategy.PaymentByCreditCard;
import org.example.strategy.PaymentService;
import org.example.strategy.PaymentStrategy;
import org.example.templateMethod.DiabloLoader;
import org.example.templateMethod.WorldOfWarcraftLoader;
import org.example.visitor.Bank;
import org.example.visitor.Client;
import org.example.visitor.InsuranceMessagingVisitor;
import org.example.visitor.Resident;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. strategy design pattern
        PaymentStrategy paymentStrategy = new PaymentByCreditCard();
        PaymentService paymentService = new PaymentService(paymentStrategy);
        paymentService.processOrder();

        // 2. decorator design pattern
        INotifier discordAndWhatsAppNotifier = new DiscordDecorator(
                new WhatsAppDecorator(
                        new Notifier("Alex")
                )
        );
        discordAndWhatsAppNotifier.send("Food is ready!");

        // 3. factory method design pattern
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        Burger beefBurger = beefRestaurant.orderBurger();

        // 4. observer design pattern
        Store store = new Store();
        store.getService().subscribe(Event.SALE, new EmailMsgListener("alex@gmail.com"));
        store.getService().subscribe(Event.NEW_ITEM, new MobileAppListener("andrew"));
        store.newItemPromotion();
        store.salePromotion();

        // 5. chain of responsibility design pattern
        Database database = new Database();
        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);
        service.logIn("username", "password");

        // 6. singleton design pattern
        Singleton singleton = Singleton.getInstance("data");

        // 7. flyweight design pattern
        org.example.flyweight.Store fw_store = new org.example.flyweight.Store();
        for (int i = 0; i < 100000 / 2; i++){
            fw_store.storeBook("AAA", 20, "Action", "A", "B");
            fw_store.storeBook("BBB", 30, "Fantasy", "C", "D");
        }

        // 8. adapter design pattern
        FancyUIServiceAdapter adapter = new FancyUIServiceAdapter();
        adapter.displayMenus(new XmlData());

        // 9. facade design pattern
        BuyCryptoFacade buyCryptoFacade = new BuyCryptoFacade();
        buyCryptoFacade.buyCryptoCurrency(1000, "BTC");

        // 10. template method design pattern
        WorldOfWarcraftLoader world = new WorldOfWarcraftLoader();
        DiabloLoader diablo = new DiabloLoader();
        world.load();
        diablo.load();

        // 11. builder design pattern
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.buildBugatti(carBuilder);
        Car car = carBuilder.build();
        CarSchemaBuilder carSchemaBuilder = new CarSchemaBuilder();
        director.buildBugatti(carSchemaBuilder);
        CarSchema carSchema = carSchemaBuilder.build();

        // 12. iterator design pattern
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);

        v0.setNeighbors(Arrays.asList(v1, v5, v4));
        v1.setNeighbors(Arrays.asList(v3, v4, v5));
        v4.setNeighbors(Arrays.asList(v2, v3));

        DepthFirstIterator<Integer> dfs = new DepthFirstIterator<>(v0);
        while (dfs.hasNext()){
            System.out.println(dfs.getNext());
        }

        // 13. composite design pattern
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setUpOrder(
                new CompositeBox(
                        new VideoGame("1", 100)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("2", 200),
                                new Book("3", 300)
                        ),
                        new VideoGame("4", 400),
                        new VideoGame("5", 500)
                )
        );
        deliveryService.calculateOrderPrice();

        // 14. command design pattern
        Room livingRoom = new LivingRoom();
        livingRoom.setCommand(
                new SwitchLightsCommand(new Light())
        );
        livingRoom.executeCommand();

        // 15. mediator design pattern
        LoginButton loginButton = new LoginButton();

        // 16. state design pattern
        Phone phone = new Phone();
        phone.state.onHome();
        phone.state.onOffOn();

        // 17. proxy design pattern
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("Throw your sister");
        videoDownloader.getVideo("Relaxing minecraft music");
        videoDownloader.getVideo("Throw your sister");
        videoDownloader.getVideo("Relaxing minecraft music");

        // 18. abstract factory design pattern
        Company msi = new MsiManufacturer();
        Gpu msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();

        // 19. bridge design pattern
        AmericanRestaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        ItalianRestaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

        // 20. interpreter design pattern ?
        Expression person1 = new TerminalExpression("Anna");
        Expression person2 = new TerminalExpression("Anne");
        Expression isSingle = new OrExpression(person1, person2);
        System.out.println(isSingle.interpreter("Anne"));

        // 21. memento design pattern
        Editor editor = new Editor();
        editor.write("Love");
        editor.write("You");
        editor.undo();

        // 22. prototype design pattern
        VehicleCache vehicleCache = new VehicleCache();
        vehicleCache.get("Bugatti Chiron");

        // 23. visitor design pattern
        InsuranceMessagingVisitor insuranceMessagingVisitor = new InsuranceMessagingVisitor();
        List<Client> clients = new ArrayList<>();
        clients.add(new org.example.visitor.Restaurant("pizzeria", "1/2", "0289232"));
        clients.add(new Bank("BT", "4/5", "3989023"));
        clients.add(new Resident("me", "4/6", "829374923"));
        insuranceMessagingVisitor.sendInsuranceMails(clients);

    }
}