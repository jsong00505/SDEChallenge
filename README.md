# PaytmLabs SDE Challenge

## Coding Question

Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.

### Minimum Requirements

1. Provide a separate interface (IE `interface`/`trait`) with documentation for the data structure
2. Provide an implementation for the interface
3. Provide any additional explanation about the interface and implementation in a README file.

## Design Question

Design A Google Analytic like Backend System.
We need to provide Google Analytic like services to our customers. Please provide a high level solution design for the backend system. Feel free to choose any open source tools as you want.

### Requirements

1. Handle large write volume: Billions of write events per day.
2. Handle large read/query volume: Millions of merchants wish to gain insight into their business. Read/Query patterns are time-series related metrics.
3. Provide metrics to customers with at most one hour delay.
4. Run with minimum downtime.
5. Have the ability to reprocess historical data in case of bugs in the processing logic.

## Coding Solution
My solution is to use the list to memorize the last N items. 

When the `add()` is called this API will add the given item to the memorized sum. If the size of the list is bigger than 
N remove the first item in the list and subtract the item to the sum.

When the `ave()` is called this API will return average of the sum with the size of the list. If the number of the items
are smaller than N, it will return the average of the total items. Also, If the list is empty, it will return 0.

When the `get()` is called this API will return the item based on the given index. If the index is bigger than or equal 
to the size of the stored items it will throw `IndexOutOfBoundsException`.

## Design Solution
* [Data Flow](highlevel-design.PNG)

* explanation

  * Use API Gateway to distribute handling the requests
  * Use NoSQL to write large amount of write and read
  * Read server run the process to update the created event from writing


