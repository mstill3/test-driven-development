## Test-Driven-Development by Example
#### Following along Test-Driven-Development by Example book by Kent Beck


### Notes

Chapter 7
- Took issue (diff class comparisons) and made it into test
- Made the test run (albeit in an ugly way)

Chapter 8
- Decoupled tests from using concrete subclasses with factory methods
- Remove duplication of times method into superclass

Chapter 9
- Add currency tests for money types
- Make the currency methods logic match to bubble up to superclass
- Add currency param to constructors so the hardcoded string can be set in the parent class Money only
- TDD is a steering process steps in correct direction