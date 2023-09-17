<h1 align="center">
  Unit test 🧪
</h1>

<p align="center">
<a href="https://sonarcloud.io/summary/new_code?id=fsoupimenta_unit-test"><img src="https://sonarcloud.io/api/project_badges/measure?project=fsoupimenta_unit-test&metric=alert_status" alt="Sonar"></a>
<a href="https://sonarcloud.io/summary/new_code?id=fsoupimenta_unit-test"><img src="https://sonarcloud.io/api/project_badges/measure?project=fsoupimenta_unit-test&metric=coverage" alt="Coverage"></a>
</p>

Study of unit testing in Java, based on [McCabe's cyclomatic complexity](https://www.guru99.com/cyclomatic-complexity.html) for the choice of test cases, as well as the use of the border testing strategy.

## Classes
To carry out the study, two basic classes were used, one with the object of calculating a person's average body mass index and returning their status in a `String`. 
The other has the objective of applying an aliquot to the value of a product, according to the rate of each federative unit in Brazil, and returning the new value as a `Double`.

### [BodyMassIndex](https://github.com/fsoupimenta/unit-test/blob/main/src/main/java/bmi/BodyMassIndex.java)
#### Results Table
<table>
<tbody>
  <tr>
    <th> Condition </th>
    <th> Female BMI </th>
    <th> Male BMI </th>
  </tr>
  <tr>
    <td> Under weight </td>
    <td> < 19.1 </td>
    <td> < 20.7 </td>
  </tr>
  <tr>
    <td> Normal weight </td>
    <td> <= 19.1 < 25.8 </td>
    <td> <= 20.7 < 26.4 </td>
  </tr>
  <tr>
    <td> Marginally overweight </td>
    <td> <= 25.8 < 27.3 </td>
    <td> <= 26.4 < 27.8 </td>
  </tr>
  <tr>
    <td> Over ideal weight </td>
    <td> <= 27.3 < 32.3 </td>
    <td> <= 27.8 < 31.1 </td>
  </tr>
  <tr>
    <td> Obese </td>
    <td>  >= 32.3 </td>
    <td>  >= 31.1 </td>
  </tr>
</tbody>
</table>

#### Cycle Complexity Graph
<h4 align="center">
<image src="/resources/BodyMassIndexCycleComplexityGraph.png" width="800">
</h4> 

### [Aliquot](https://github.com/fsoupimenta/unit-test/blob/main/src/main/java/aliquot/Aliquot.java)
#### Results Table
<table>
<tbody>
  <tr>
    <th> Federation Units </th>
    <th> Product Value </th>
    <th> Aliquot Tax </th>
    <th> Final Value </th>
  </tr>
  <tr>
    <td> AC - AL - ES - GO - MT - MS - PA - RR - SC </td>
    <td> 100.00 </td>
    <td> 17% </td>
    <td> 117.00 </td>
  </tr>
    <td> AM - AP - BA - CE - DF - MA - MG - PB - PR - PE - PI - RN - RS - RJ - SP - SE - TO </td>
    <td> 100.00 </td>
    <td> 18% </td>
    <td> 118.00 </td>
  </tr>
  </tr>
    <td> RO </td>
    <td> 100.00 </td>
    <td> 17.5% </td>
    <td> 117.50 </td>
  </tr>
</tbody>
</table>

#### Cycle Complexity Graph
<h4 align="center">
<image src="/resources/AliquotCycleComplexityGraph.png" width="800">
</h4> 
