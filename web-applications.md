---
layout: page
title: Cayenne by Example - Web Applications
heading: Web Applications
breadcrumb:
  - name: Cayenne By Example
    link: ..
  - name: Web Applications
---

<table class="pb">
  <tr>
    <td>Cayenne Version</td>
    <td>3.0.2</td>
  </tr>
  <tr>
    <td>Project Directory</td>
    <td>
      <a href="https://github.com/mrg/cbe/tree/master/WebApplications">WebApplications</a>
    </td>
  </tr>
  <tr>
    <td>Source Directory</td>
    <td>
      <a href="https://github.com/mrg/cbe/tree/master/WebApplications/src/main/java">
        WebApplications/src/main/java
      </a>
      (Cayenne and Tapestry classes)
    </td>
  </tr>
  <tr>
    <td>Resource Directories</td>
    <td>
      <a href="https://github.com/mrg/cbe/tree/master/WebApplications/src/main/resources">
        WebApplications/src/main/resources
      </a>
      (Cayenne Model and Tapestry templates)
      <br/>
      <a href="https://github.com/mrg/cbe/tree/master/WebApplications/src/main/webapp">
        WebApplications/src/main/webapp
      </a>
      (web-specific resources, such as CSS, JavaScript, web.xml)
    </td>
  </tr>
    <td>Inputs</td>
    <td>N/A</td>
  <tr>
  </tr>
  <tr>
    <td>Compiling/Running</td>
    <td>
      cd WebApplications<br/>
      mvn clean compile<br/>
      mvn jetty:run<br/>
      Open URL <a href="http://localhost:7890/cbe/">http://localhost:7890/cbe/</a>
    </td>
  </tr>
  <tr>
    <td>View/Edit Model</td>
    <td>mvn cayenne-modeler:run</td>
  </tr>
  </tr>
    <td>Status</td>
    <td>
      Code: Very Lacking<br/>
      Documentation: Very Lacking
    </td>
  <tr>
</table>

This example illustrates integrating Cayenne into a Java-based web application. The following frameworks and techniques are utilized:

* Cayenne for ORM operations.
* [Tapestry](http://tapestry.apache.org/) for the web framework.
* [Jetty](http://www.eclipse.org/jetty/) for the application server.
* [Flyway](http://flywaydb.org/) for database migrations.
* Plus JNDI connections, running Jetty from within Maven, etc.
