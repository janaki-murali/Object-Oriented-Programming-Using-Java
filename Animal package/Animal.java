/*Consider a scenario where an interface named ‘Animal’ is in package named ‘animalpackage ’ and it declares two methods ‘get_cries’
and ‘get_eating_type’ that are place holders for printing cry and eating type of animals.The subpackages of ‘animalpackage ’ are ‘herbivorous'
and ‘carnivorous’.The ‘herbivorous’ package contain two classes ‘cow’ and ‘elephant’ that implements the ‘Animal’ interface.Similarly the
‘carnivorous’ package contain ‘lion’ and ‘bear’ that too implements the interface.Design a main class that import these classes and invokes the
corresponding methods.*/

package animalpackage;
public interface Animal
{
    void get_cries();
    void get_eating_type();
}
