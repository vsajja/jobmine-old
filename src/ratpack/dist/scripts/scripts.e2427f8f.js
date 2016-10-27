"use strict";angular.module("jobmineApp",["ngAnimate","ngCookies","ngResource","ngRoute","ngSanitize","ngTouch","ui.bootstrap","smart-table","restangular"]).config(["$routeProvider","RestangularProvider",function(a,b){a.when("/",{templateUrl:"views/main.html",controller:"MainCtrl",controllerAs:"main"}).when("/jobs",{templateUrl:"views/jobs.html",controller:"JobsCtrl",controllerAs:"jobs"}).when("/about",{templateUrl:"views/about.html",controller:"AboutCtrl",controllerAs:"about"}).otherwise({redirectTo:"/"}),b.setBaseUrl("/api/v1")}]),angular.module("jobmineApp").controller("MainCtrl",function(){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"]}),angular.module("jobmineApp").controller("AboutCtrl",function(){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"]}),angular.module("jobmineApp").controller("JobsCtrl",["$scope","Restangular",function(a,b){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"];var c=b.all("jobs");c.getList().then(function(b){a.rowCollection=b})}]),angular.module("jobmineApp").run(["$templateCache",function(a){a.put("views/about.html","<h1>This is the about view</h1>"),a.put("views/jobs.html",'<table st-table="rowCollection" class="table table-striped"> <thead> <tr> <th></th> <th>Id</th> <th>Title</th> <th>Employer</th> <th>Description</th> <th>Location</th> <th>Status</th> <th>Details</th> </tr> </thead> <tbody> <tr ng-repeat="row in rowCollection"> <!-- TODO: better way for logos --> <td><img height="50px" width="50px" src="{{\'data:image/png;base64,\' + row.employerlogo}}"></td> <td>{{row.jobpostingid}}</td> <td>{{row.title}}</td> <td>{{row.employername}}</td> <td>{{row.description_9 | limitTo: 100}}{{row.description_9.length > 100 ? \'...\' : \'\'}}</td> <td>{{row.location}}</td> <td><span class="label label-success">Approved</span></td> <td><a data-toggle="modal" data-target="#myModal" class="btn btn-primary btn-sm">Details</a></td> </tr> </tbody> </table> <!-- Modal --> <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"> <div class="modal-dialog" role="document"> <div class="modal-content"> <div class="modal-header"> <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button> <h4 class="modal-title" id="myModalLabel">Software Engineer</h4> <!-- implement shortlist --> <style>.custom {\n            color: #7f8c8d;\n            opacity: 0.7;\n          }\n\n          .custom:active {\n            color: red\n          }</style> <button class="custom"> <span class="glyphicon glyphicon-heart"></span> </button> </div> <div class="modal-body"> <div> <p><strong>Location:</strong> Kirkland WA</p> <p><strong>Industry:</strong> Computer Software <br><strong>Occupational Category:</strong> 15-1132.00 Software Developers, Application <br><strong>Hours:</strong> Full-time, 40 hours per week <br><strong>Salary:</strong> USD 100000 </p> <p> <strong>Description:</strong> ABC Company Inc. seeks a full-time mid-level software engineer to develop in-house tools. </p> <p><strong>Responsibilities:</strong></p> <ul> <li>Design and write specifications for tools for in-house customers</li> <li>Build tools according to specifications</li> </ul> <p><strong>Educational requirements:</strong></p> <ul> <li>Bachelor\'s Degree in Computer Science, Information Systems or related fields of study.</li> </ul> <p><strong>Experience requirements:</strong></p> <ul> <li>Minumum 3 years experience as a software engineer</li> </ul> <p><strong>Desired Skills:</strong></p> <ul> <li>Web application development using Java/J2EE</li> <li>Web application development using Python or familiarity with dynamic programming languages</li> </ul> <p><strong>Qualifications:</strong></p> <ul> <li>Ability to work in a team environment with members of varying skill levels.</li> <li>Highly motivated.</li> <li>Learns quickly.</li> </ul> <p><strong>Benefits:</strong></p> <ul> <li>ABC Corp provides top-tier employee compensation benefits and a relaxed, team-oriented work environment, including: Medical, Life, Dental </li> </ul> <p><strong>Incentives:</strong></p> <ul> <li>Performance-based annual bonus plan, project-completion bonuses</li> </ul> <p>If interested in this position, please email us your resume, along with salary requirements and a cover letter to Jobs@abc.123.</p> <p>Date Posted: 2011-10-31</p> </div> </div> <div class="modal-footer"> <button type="button" class="btn btn-default" data-dismiss="modal">Close</button> <button type="button" class="btn btn-primary">Apply</button> </div> </div> </div> </div>'),a.put("views/main.html",'<div class="container"> <div class="col-md-12"> <form class="form-horizontal" role="form"> <div class="form-group"> <span class="glyphicon glyphicon-search" aria-hidden="true"></span> <input type="text" class="form-control" placeholder="Job Title, Skills or Company"> <span class="glyphicon glyphicon-road" aria-hidden="true"></span> <input type="text" class="form-control" placeholder="Location"> <a href="#/jobs"> <button type="submit" class="btn btn-default">Search</button> </a> </div> </form> </div> </div>')}]);