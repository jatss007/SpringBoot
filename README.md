# SpringBoot

1.) Add Aspect Dependency in POM.XML FILE

       <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aop</artifactId>
            <version>5.0.1.RELEASE</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.8.12</version>
            <scope>compile</scope>
        </dependency>

2.) Build Project and now @aspect annotation will work.

3.) Create a Business Class Which will include a Business Logic
	import org.springframework.stereotype.Component;

	@Component
	public class Business {

		public void show() {

			System.out.println("This is business logic");

		}


	}

4.) Create a class which will contain all you aspect.

	@Aspect
	@Component

	public class AspectClass {

	    @Before("execution(public void show())")
	    public void BeforeAspect(){

		System.out.println("HELLO");

	    }

	    @After("execution(public void show())")
	    public void AfterAspect(){

		System.out.println("Bye");

	    }
	}

5.) Now in you Main class you need to run you Business class

	ApplicationContext cur =  SpringApplication.run(AspectsApplication.class, args);

        Business b = cur.getBean(Business.class);

        b.show();


6.) Build and Run.

