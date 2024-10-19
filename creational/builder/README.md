Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

# Use the Builder pattern to get rid of a “telescoping constructor”.
  The Builder pattern lets you build objects step by step, using only those steps that you really need. After implementing the pattern, you don’t have to cram dozens of parameters into your constructors anymore.

# Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).
  The Builder pattern lets you construct products step-by-step. You could defer execution of some steps without breaking the final product. You can even call steps recursively, which comes in handy when you need to build an object tree.

  A builder doesn't expose the unfinished product while running construction steps. This prevents the client code from fetching an incomplete result.