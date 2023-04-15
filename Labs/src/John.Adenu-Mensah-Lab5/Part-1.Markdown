
<script type="module">
import mermaid from 'https://cdn.jsdelivr.net/npm/mermaid@10/dist/mermaid.esm.min.mjs';
mermaid.initialize({ startOnLoad: true });
</script>

# Lab assignment 5

## Part 1

1. Identify 4 mebers of Java Collection **Class** or **Interfaces**
   1. List
   2. Set
   3. Queue
   4. Stack

2. Analyse these 4 by explaining **two key characteristics of each**
   1. List
      1. Can allow duplicate elements.
      2. Allows you to have null elements.

   2. Set
      1. Does not allow duplicate elements.
      2. Models a matheatical set.

   3. Queue
      1. First element that enters a queue is the first one to be removed.
      2. There are two different classes that are used to implement the queue interface.

   4. Stack
      1. First element that enters a stack is the last one to be removed.
      2. Has methods like push(E item) and pop(E item).

## Part 2

1. What is your understanding of types in traingle braces.
    1. It specifies the data type of element that can be placed in the interface.
    2. String represents the string class, which will only allow strings to be placed in the List interface.
    3. String and Integer represent the key-value paring for the map interface.

1. This is legal because the ArrayList collection implements the List interface.

1. ArrayList and LinkedList both implement the list interface as general purpose implementations.CopyOnWriteArrayList is a special-purpose list implementation. Classes like HashMap, TreeMap, and LinkedMap are implementations of the Map interface.

![](https://mermaid.ink/img/pako:eNqtksFqwzAMQH_FiB06lv5AKIGxXQrdKVdDEbaSmSVyJ9uH0qXfPifrNu9Q6GE6CevpCcs-gfGWoAYzYAjPDnvBUbPKsZyoLUfxNpnoPD_5YaAlC-r0Bc2xcyGqcxvFcX9WjCOF3-ILHr5r--yinuTCPPYl9yCEto3JEsctd341W_9Kq1l23XV_V9jeE8nxX3RTuY3ZUtx8s3G5Tzo01DQ_eNmQR9zIX1v0ev3RLHNvwPI0zVDBSDKis_lZl-Ea4iuNpKHOqUV506B5yhym6NsjG6ijJKogHSxGuvwCqDscAk2fcHy4Wg?type=png)
<!-- 
```mermaid
classDiagram
    class IntroductionCollections {
        List ~String~ names
        Map ~String_Integer~ namesAges
        +readStudentInfo(List~String~ names, Map~String_Integer~ namesAges)$
        +queryStudentInfo(List~String~ names, Map~String_Integer~ namesAges)$
    }
    class List{
        <<interface>>
    }

    class Map{
        <<interface>>
    }

    IntroductionCollections --|> List
    IntroductionCollections --|> Map

``` -->
