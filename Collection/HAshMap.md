# Introduction
HashMap is an implemented class of Map Interface.

Syntax
package java.util
class HashMap implements Map, Cloneable, Serialization
{
 //constructors
 //methods
}

introduced in JDK 1.2 V

HashMap underlined Datastructure is "HashTable"

# properties

- hashmap stores the value in key-value pair. each key value pair is known as entry
- key is unique and value can be duplicate
- hashmap contain max one null value  in key but multiple null values in values
- hashmap can store hetregenous elements
- hashmap does not follow the sorting and insertion order
- hashmap is non-synchronized datastructure (multiple thread can execute parallelly threfore fast but data in consistency 
  problem can be faced)

-HashMap capacity means number of buckets in the hashtable
- when we create hashmap initial capacity will be 16 , which can be changed

- Load factor is a threshold , when we add an element in HashMap and it crosses this threshold than the capacity of the hashmap will increased
- Default LoadFactor of hashmap is .75

- we can retrieve hashmap elements in 2 ways
- using set and iterator interface
- directly
- In both cases we use Map.Entry interface
