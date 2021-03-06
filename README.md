# Java Automated Testing

Choose a point on the plane, and fill a collection with several regular shapes (circle, regular
triangle, square, regular hexagon). **_How many shapes contain the given point?_**

Each shape can be represented by its center and side length (or radius), if we assume that one
side of the polygons are parallel with x axis, and its nodes lies on or above this side.
Load and create the shapes from a text file. The first line of the file contains the number of the
shapes, and each following line contain a shape. The first character will identify the type of the
shape, which is followed by the center coordinate and the side length or radius.
Manage the shapes uniformly, so derive them from the same super class.

## Common requirements:
* Use a Collection to store the objects of classes derived from the same super class.
* Use foreach to process the elements of a Collection.
* Validate the data what you get from the user; throw Exception for invalid data, and handle
the thrown Exceptions.
* The documentation should contain:
  * the description of the exercise,
  * the class diagram,
  * the short description of each methods,
  * and the testing (white box / black box).
