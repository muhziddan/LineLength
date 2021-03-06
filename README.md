# Calculate Line Length

## Problem statement

Our client is a fan of geometry, He wants to model a line based on points consisting of x and y coordinates plane based
on cartesian system. He wants to calculate it is length. All the input and output are real numbers.

## Dev environment setup

- JDK 8 (https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html)
- Gradle (https://gradle.org/install/)
- *Optional: IntelliJ (https://www.jetbrains.com/idea/download/#section=mac)

## How  to run test

- Run `gradle test`

## Build instructions

- Run `gradle build`

## How to use instructions

`LineLength lineLength = new LineLength()`

- For length on Origin / Point 0 with zero length:
  `lineLength.calculateZeroLengthLine()`
- For length on Horizontal Origin:
  `lineLength.calculateHorizontalOrigin()`
- For length on Vertical Origin:
  `lineLength.calculateVerticalOrigin()`
