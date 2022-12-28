# Strategy Pattern

### Definition
Strategy pattern is used when we have multiple algorithms for a specific task and client decides the actual implementation to be used at runtime i.e we define multiple algorithms and let client application pass the algorithm to be used as a parameter.

### Real Usecase
One of the best example of this is `Collections.sort()` method that takes Comparator parameter. Based on the different implementations of Comparator interface, the objects are getting sorted in different ways.

### Example 
**Q. Implement a simple shopping cart where we have three payment strategies - using credit card, paypal or UPI.**

**A.** We will follow the below steps:
- First of all we will create the interface for our payment strategy
- Then we will create the concrete implementation of our payment algorithms
- Then we will implement the shopping cart and payment method that will require input as payment strategy.

![ShopingCartClassDigram](../images/ShopingCartClassDigram.png?raw=true "ShopingCartClassDigram")