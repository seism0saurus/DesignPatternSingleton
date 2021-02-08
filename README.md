# Design Pattern: Singleton

This is a simple example of the singleton pattern. I wrote a blog post about it:
https://seism0saurus.de/design-pattern-singleton.html (German)

The code is separated into two parts. The before package shows an implementation without the pattern. The after package
shows the implementation with a singleton. The singleton uses a double-checked locking of a volatile field for thread safety.