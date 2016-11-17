"use strict";angular.module("jobmineApp",["ngAnimate","ngCookies","ngResource","ngRoute","ngSanitize","ngTouch","ui.bootstrap","smart-table","restangular"]).config(["$routeProvider","RestangularProvider",function(a,b){a.when("/",{templateUrl:"views/main.html",controller:"MainCtrl",controllerAs:"main"}).when("/jobs",{templateUrl:"views/jobs.html",controller:"JobsCtrl",controllerAs:"jobs"}).when("/about",{templateUrl:"views/about.html",controller:"AboutCtrl",controllerAs:"about"}).when("/schools",{templateUrl:"views/schools.html",controller:"SchoolsCtrl",controllerAs:"schools"}).when("/students",{templateUrl:"views/students.html",controller:"StudentsCtrl",controllerAs:"students"}).when("/companies",{templateUrl:"views/companies.html",controller:"CompaniesCtrl",controllerAs:"companies"}).when("/settings",{templateUrl:"views/developers.html",controller:"SettingsCtrl",controllerAs:"settings"}).when("/students/:studentId",{templateUrl:"views/student.html",controller:"StudentProfileCtrl",controllerAs:"studentProfile"}).when("/companies/:companyId",{templateUrl:"views/company.html",controller:"CompanyProfileCtrl",controllerAs:"companyProfile"}).when("/jobs/:jobId",{templateUrl:"views/job.html",controller:"JobProfileCtrl",controllerAs:"jobProfile"}).when("/mines/:mineId",{templateUrl:"views/mine.html",controller:"MineProfileCtrl",controllerAs:"mineProfile"}).when("/schools/:schoolId",{templateUrl:"views/school.html",controller:"SchoolProfileCtrl",controllerAs:"schoolProfile"}).when("/mines",{templateUrl:"views/mines.html",controller:"MinesCtrl",controllerAs:"mines"}).when("/register",{templateUrl:"views/register.html",controller:"RegisterCtrl",controllerAs:"register"}).when("/register/student",{templateUrl:"views/student-register.html",controller:"StudentRegisterCtrl",controllerAs:"studentRegister"}).when("/register/school",{templateUrl:"views/school-register.html",controller:"SchoolRegisterCtrl",controllerAs:"schoolRegister"}).when("/register/company",{templateUrl:"views/company-register.html",controller:"CompanyRegisterCtrl",controllerAs:"companyRegister"}).otherwise({redirectTo:"/"}),b.setBaseUrl("/api/v1")}]),angular.module("jobmineApp").controller("MainCtrl",["$scope","Restangular",function(a,b){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"];var c=b.all("jobmine");c.customGET().then(function(b){a.jobmine=b})}]),angular.module("jobmineApp").controller("JobsCtrl",["$scope","Restangular",function(a,b){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"];var c=b.all("jobs");c.getList().then(function(b){a.jobList=b,a.jobCollection=[].concat(a.jobList)})}]),angular.module("jobmineApp").controller("AboutCtrl",function(){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"]}),angular.module("jobmineApp").controller("CompaniesCtrl",["$scope","Restangular",function(a,b){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"];var c=b.all("companies");c.getList().then(function(b){a.companyList=b,a.companyCollection=[].concat(a.companyList)})}]),angular.module("jobmineApp").controller("StudentsCtrl",["$scope","Restangular",function(a,b){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"];var c=b.all("students");c.getList().then(function(b){a.rowList=b,a.rowCollection=[].concat(a.rowList)})}]),angular.module("jobmineApp").controller("SchoolsCtrl",["$scope","Restangular",function(a,b){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"];var c=b.all("schools");c.getList().then(function(b){a.schoolList=b,a.schoolCollection=[].concat(a.schoolList)})}]),angular.module("jobmineApp").controller("MinesCtrl",["$scope","Restangular",function(a,b){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"];var c=b.all("mines");c.getList().then(function(b){a.mineList=b,a.mineCollection=[].concat(a.mineList)})}]),angular.module("jobmineApp").controller("DevelopersCtrl",function(){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"]}),angular.module("jobmineApp").controller("StudentProfileCtrl",["$scope","$routeParams","Restangular",function(a,b,c){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"];var d=b.studentId,e=c.one("students",d);e.customGET().then(function(b){a.student=b})}]),angular.module("jobmineApp").controller("CompanyProfileCtrl",["$scope","$routeParams","Restangular",function(a,b,c){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"];var d=b.companyId,e=c.one("companies",d);e.customGET().then(function(b){a.company=b})}]),angular.module("jobmineApp").controller("JobProfileCtrl",["$scope","$routeParams","Restangular",function(a,b,c){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"];var d=b.jobId,e=c.one("jobs",d);e.customGET().then(function(b){a.job=b})}]),angular.module("jobmineApp").controller("MineProfileCtrl",function(){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"]}),angular.module("jobmineApp").controller("SchoolProfileCtrl",["$scope","$routeParams","Restangular",function(a,b,c){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"];var d=b.schoolId,e=c.one("schools",d);e.customGET().then(function(b){a.school=b})}]),angular.module("jobmineApp").controller("RegisterCtrl",function(){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"]}),angular.module("jobmineApp").controller("StudentRegisterCtrl",["$scope","Restangular",function(a,b){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"],a.student={},a.alerts=[],a.registerStudent=function(){var c=b.all("students");c.post(a.student).then(function(b){a.alerts.push({type:"success",msg:"Success! Added student! Email: "+b.emailAddress})},function(){a.alerts.push({type:"danger",msg:"Error! Unable to add student."})})},a.closeAlert=function(b){a.alerts.splice(b,1)}}]),angular.module("jobmineApp").controller("SchoolRegisterCtrl",["$scope","Restangular",function(a,b){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"],a.school={},a.alerts=[],a.registerSchool=function(){var c=b.all("schools");c.post(a.school).then(function(b){a.alerts.push({type:"success",msg:"Success! Added school! Name: "+b.name})},function(){a.alerts.push({type:"danger",msg:"Error! Unable to add school."})})},a.closeAlert=function(b){a.alerts.splice(b,1)}}]),angular.module("jobmineApp").controller("CompanyRegisterCtrl",["$scope","Restangular",function(a,b){this.awesomeThings=["HTML5 Boilerplate","AngularJS","Karma"],a.company={},a.alerts=[],a.registerCompany=function(){var c=b.all("companies");c.post(a.company).then(function(b){a.alerts.push({type:"success",msg:"Success! Added company! Name: "+b.name})},function(){a.alerts.push({type:"danger",msg:"Error! Unable to add company."})})},a.closeAlert=function(b){a.alerts.splice(b,1)}}]),angular.module("jobmineApp").run(["$templateCache",function(a){a.put("views/about.html","Schools: <ol> <li>Get invited</li> <li>Invite students & alumnis</li> <li>Approve jobs</li> <li>Showcase students</li> </ol> Students: <ol> <li>Get invited by school</li> <li>Upload resume</li> <li>Search, shortlist, apply</li> <li>Interview</li> <li>Negotiate</li> <li>Accept Offer</li> <li>Review companies (optional, disclose everything!)</li> </ol> Companies: <ol> <li>Get invited</li> <li>Select schools</li> <li>Post jobs</li> <li>Interview</li> <li>Offer</li> <li>Negotiate</li> </ol> <h1>calendar</h1> <h5>job posting cycles</h5> <h1>feedback</h1> <h5>upvote</h5>"),a.put("views/companies.html",'<table st-table="companyCollection" st-safe-src="companyList" class="table table-striped"> <tr> <th colspan="10"><input st-search="" class="form-control" placeholder="Filter results..." type="text"></th> </tr> <thead> <tr> <th></th> <!--<th>Logo</th>--> <th st-sort="name" class="st-sort-ascent">Name</th> <th st-sort="description" class="st-sort-ascent">Description</th> <th st-sort="websiteUrl" class="st-sort-ascent">Website</th> <th st-sort="industry" class="st-sort-ascent">Industry</th> <th st-sort="totalEmployees" class="st-sort-ascent">Total Employees</th> <th st-sort="foundedDate" class="st-sort-ascent">Founded Date</th> </tr> </thead> <tbody> <tr ng-repeat="company in companyCollection"> <td><i class="fa fa-building fa-3x" aria-hidden="true"></i></td> <!--<td><img style="height: auto; width: auto; max-width: 100px; max-height: 100px" ng-src="{{row.logourl}}"/></td>--> <td><a ng-href="#/companies/{{company.companyId}}">{{company.name}}</a></td> <td>{{company.description}}</td> <td>{{company.websiteUrl}}</td> <td>{{company.industry}}</td> <td>{{company.totalEmployees}}</td> <td>{{company.foundedDate}}</td> </tr> </tbody> </table>'),a.put("views/company-register.html",'<div class="row"> <div class="col-sm-4"> </div> <div class="col-sm-4"> <!-- SHOW ERROR/SUCCESS MESSAGES --> <div uib-alert ng-repeat="alert in alerts" ng-class="\'alert-\' + (alert.type || \'warning\')" close="closeAlert($index)">{{alert.msg}} </div> <div uib-alert template-url="alert.html" style="background-color:#fa39c3;color:white"></div> <div class="panel panel-default"> <div class="panel-heading"> <h4>Company</h4> </div> <div class="panel-body"> <div class="box box-info"> <div class="box-body"> <!-- FORM --> <form ng-submit="registerCompany()"> <!-- NAME --> <div id="name-group" class="form-group"> <label>Name</label> <input type="text" name="name" class="form-control" placeholder="Name" ng-model="company.name" required> <span class="help-block"></span> </div> <!-- DESCRIPTION --> <div id="name-group" class="form-group"> <label>Description</label> <textarea style="height:125px; resize: none" cols="30" rows="10" name="description" class="form-control" placeholder="Description" ng-model="company.description" required></textarea> <span class="help-block"></span> </div> <!-- WEBSITE URL --> <div id="name-group" class="form-group"> <label>Website</label> <input type="text" name="websiteUrl" class="form-control" placeholder="Website Url" ng-model="company.websiteUrl" required> <span class="help-block"></span> </div> <!-- INDUSTRY --> <div id="name-group" class="form-group"> <label>Industry</label> <input type="text" name="industry" class="form-control" placeholder="Industry" ng-model="company.industry" required> <span class="help-block"></span> </div> <!-- SUBMIT BUTTON --> <button type="submit" class="btn btn-success btn-lg btn-block"> Register </button> </form> <br> <textarea style="height:125px; resize: none" cols="30" rows="10" name="description" class="form-control">{{ company }}</textarea> </div> </div> </div> </div> </div> <div class="col-sm-4"> </div> </div>'),a.put("views/company.html",'<div class="row"> <div class="col-sm-4"> <div class="panel panel-default"> <div class="panel-heading">Company</div> <div class="panel-body"> <div class="box box-info"> <div class="box-body"> <div class="col-sm-6"> <div align="center"> <!--<img height="200px" width="200px" src="images/student_profile_nobody.29ae7644.jpg"--> <!--class="img-circle img-responsive">--> <i class="fa fa-building fa-5x" aria-hidden="true"></i> <div style="color:#999">click here to change profile image</div> </div> <br> </div> <div class="col-sm-6"> <h4 style="color:#00b1b1">{{company.name}}</h4> </div> <div class="clearfix"></div> <hr style="margin:5px 0 5px 0"> <div class="col-sm-5 col-xs-6 tital"><strong>Id</strong></div> <div class="col-sm-7 col-xs-6">{{company.companyId}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Industry</strong></div> <div class="col-sm-7 col-xs-6">{{company.industry}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Website</strong></div> <div class="col-sm-7 col-xs-6">{{company.websiteUrl}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Founded</strong></div> <div class="col-sm-7 col-xs-6">{{company.foundedDate}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="clearfix"></div> <hr style="margin:5px 0 5px 0"> <div class="col-sm-5 col-xs-6 tital"><strong>Total Employees</strong></div> <div class="col-sm-7 col-xs-6">{{company.totalEmployees}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Total Views</strong></div> <div class="col-sm-7 col-xs-6">1</div> <div class="clearfix"></div> <div class="bot-border"></div> </div> </div> </div> </div> <div class="panel panel-default"> <div class="panel-heading">Follow</div> <div class="panel-body"> <i class="fa fa-facebook fa-2x"></i> <i class="fa fa-github fa-2x"></i> <i class="fa fa-twitter fa-2x"></i> <i class="fa fa-pinterest fa-2x"></i> <i class="fa fa-google-plus fa-2x"></i> </div> </div> </div> <div class="col-sm-8"> <div class="panel panel-default"> <div class="panel-heading">Description</div> <div class="panel-body"> {{company.description}} </div> </div> </div> </div>'),a.put("views/developers.html","<h1>REST API</h1> <h2>Resources</h2> <div> <a>Schools</a><br> <a>Students</a><br> <a>Companies</a><br> <a>Jobs</a><br> <a>Mines</a><br> <a>Interviews</a><br> <a>Offers</a><br> <a>Applications</a><br> </div>"),a.put("views/job.html",'<div class="row"> <div class="col-sm-4"> <div class="panel panel-default"> <div class="panel-heading">Job</div> <div class="panel-body"> <div class="box box-info"> <div class="box-body"> <div class="col-sm-6"> <div align="center"> <!--<img height="200px" width="200px" src="images/student_profile_nobody.29ae7644.jpg"--> <!--class="img-circle img-responsive">--> <i class="fa fa-briefcase fa-5x" aria-hidden="true"></i> <div style="color:#999">click here to change profile image</div> </div> <br> </div> <div class="col-sm-6"> <h4 style="color:#00b1b1">{{job.title}}</h4> <h4 style="color:#00b1b1">Company</h4> <h4 style="color:#00b1b1">Ontario, Canada, Planet Earth</h4> </div> <div class="clearfix"></div> <hr style="margin:5px 0 5px 0"> <div class="col-sm-5 col-xs-6 tital"><strong>Id</strong></div> <div class="col-sm-7 col-xs-6">{{job.jobId}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Type</strong></div> <div class="col-sm-7 col-xs-6">{{job.type}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Industry</strong></div> <div class="col-sm-7 col-xs-6">Industry</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Status</strong></div> <div class="col-sm-7 col-xs-6">{{job.status}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Created</strong></div> <div class="col-sm-7 col-xs-6">{{job.createdTimestamp | date}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="clearfix"></div> <hr style="margin:5px 0 5px 0"> <div class="col-sm-5 col-xs-6 tital"><strong>Total Openings</strong></div> <div class="col-sm-7 col-xs-6">{{job.totalOpenings}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Total Applicants</strong></div> <div class="col-sm-7 col-xs-6">{{job.totalOpenings}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Total Views</strong></div> <div class="col-sm-7 col-xs-6">0</div> <div class="clearfix"></div> <div class="bot-border"></div> </div> </div> </div> </div> <div class="panel panel-default"> <div class="panel-heading">Share</div> <div class="panel-body"> <i class="fa fa-facebook fa-2x"></i> <i class="fa fa-github fa-2x"></i> <i class="fa fa-twitter fa-2x"></i> <i class="fa fa-pinterest fa-2x"></i> <i class="fa fa-google-plus fa-2x"></i> </div> </div> </div> <div class="col-sm-8"> <div class="panel panel-default"> <div class="panel-heading">Description</div> <div class="panel-body"> {{job.description}} </div> </div> <div class="panel panel-default"> <div class="panel-heading" style="color: red">Required</div> <div class="panel-body"> <h5>skill 1, skill 2, skill 3</h5> <h5>relocation</h5> <h5>visa</h5> </div> </div> <div class="panel panel-default"> <div class="panel-heading">Optional</div> <div class="panel-body"> <h5>skill 1, skill 2, skill 3</h5> </div> </div> <div class="panel panel-default"> <div class="panel-heading">Salary</div> <div class="panel-body"> Not a paid position! </div> </div> </div> </div>'),a.put("views/jobs.html",'<table st-table="jobCollection" st-safe-src="jobList" class="table table-striped"> <tr> <!-- TODO: add dropdown, filter by location etc --> <th colspan="10"><input st-search="" class="form-control" placeholder="Filter results..." type="text"></th> </tr> <thead> <tr> <th></th> <th st-sort="title" class="st-sort-ascent">Title</th> <th st-sort="description" class="st-sort-ascent">Description</th> <th st-sort="type" class="st-sort-ascent">Type</th> <th st-sort="createdTimestamp" class="st-sort-ascent">Created</th> <th st-sort="status" class="st-sort-ascent">Status</th> <!--<th st-sort="location" class="st-sort-ascent">Location</th>--> <!--<th st-sort="employername" class="st-sort-ascent">Company</th>--> <!--<th st-sort="type" class="st-sort-ascent">Type</th>--> <!--<th >Description</th>--> <!--<th>Status</th>--> <!--<th>Apply</th>--> <th st-sort="totalOpenings" class="st-sort-ascent">Total Openings</th> <th>Applications</th> </tr> </thead> <tbody> <tr ng-repeat="job in jobCollection"> <!-- TODO: load icon --> <td><i class="fa fa-briefcase fa-2x" aria-hidden="true"></i> </td> <!--<td>{{job.title}}</td>--> <td><a ng-href="#/jobs/{{job.jobId}}">{{job.title}}</a></td> <td>{{job.description}}</td> <td>{{job.type}}</td> <td>{{job.createdTimestamp | date}}</td> <!--<td>{{job.location}}</td>--> <!--<td>{{job.employername}}</td>--> <!--<td>Full-Time</td>--> <!--<td>{{job.description_9 | limitTo: 100}}{{job.description_9.length > 100 ? \'...\' : \'\'}}</td>--> <td><span class="label label-warning">{{job.status}}</span></td> <!--<td><a data-toggle="modal" data-target="#myModal" class="btn btn-primary btn-sm">Apply</a></td>--> <td style="text-align: center">{{job.totalOpenings}}</td> <td style="text-align: center">0</td> </tr> </tbody> </table>'),a.put("views/main.html",'<div class="row"> <div class="col-sm-2"> </div> <div class="col-sm-8"> <div align="center"> <h1> <p style="font-family: Calibri; color: blue; font-size: 200%"><b>jobmine</b></p> </h1> </div> <div align="center"> <h4>free for <strong>{{jobmine.schools}}</strong> <a href="#/schools">schools</a>, <strong>{{jobmine.students}}</strong> <a href="#/students">students</a> and <strong>{{jobmine.companies}}</strong> <a href="#/companies">companies</a> </h4> </div> <div align="center"> <i class="fa fa-globe fa-5x" style="color:blue; font-size: 100px" aria-hidden="true"></i> </div> <div align="center"> <h4> search <strong>{{jobmine.jobs}}</strong> <a href="#/jobs">jobs</a> from <strong>{{jobmine.mines}}</strong> <a href="#/mines">mines</a> </h4> </div> <div align="center"> <!-- TODO: countries --> <form class="form-inline"> <input disabled size="20" style="height: 30px; font-family: Calibri; color: blue; font-size: 150%" type="text" class="form-control" placeholder="Company, Job, or Skills..."> <input disabled size="20" style="height: 30px; font-family: Calibri; color: blue; font-size: 150%" class="form-control" placeholder="Location..."> <a href="#/jobs"> <button style="border: none; background: none"><p><i class="fa fa-search fa-2x" aria-hidden="true"></i></p> </button> </a> </form> </div> <br> <div align="center"> <h4> <i class="fa fa-sign-in" aria-hidden="true"></i> <a href="#/register">register now!</a> </h4> </div> </div> <div class="col-sm-2"> </div> </div> <!--<h5>0 recruiters (that recruit companies instead and are not paid by the students!)</h5>--> <!--<h5>0 universities, 0 colleges, 0 highschools</h5>--> <!--<h5>0 jobs</h5>--> <!--<h5>0 full-time, 0 part-time, 0 contracts, 0 internships, 0 volunteers, 0 start-ups</h5>--> <!--<h5>0 applications</h5>--> <!--<h5>0 jobs filled</h5>--> <!--<h5>0 countries</h5>--> <!--<h5>0 start-ups</h5>--> <!--<h5>0 recruiters</h5>--> <!--<h5>$0 in salary negotiated</h5>-->'),a.put("views/mine.html","<p>This is the mine-profile view.</p>"),a.put("views/mines.html",'<table st-table="mineCollection" st-safe-src="mineList" class="table table-striped"> <tr> <th colspan="2"><input st-search="" class="form-control" placeholder="Filter results..." type="text"></th> </tr> <thead> <tr> <th></th> <th st-sort="title" class="st-sort-ascent">Title</th> </tr> </thead> <tbody> <tr ng-repeat="mine in mineCollection"> <td> <i class="fa fa-gear fa-2x" aria-hidden="true"></i> </td> <td>{{mine.name}}</td> </tr> </tbody> </table>'),a.put("views/register.html",'<div class="row"> <div class="col-sm-5"> </div> <div class="col-sm-2"> <div class="panel panel-default"> <div class="panel-heading">Register</div> <div class="panel-body"> <div align="center"> <a href="#/register/school"><i class="fa fa-graduation-cap fa-5x" style="font-size: 50px" aria-hidden="true"></i></a> <p style="font-family: Calibri; font-size: 100%"><b>School</b></p> <div class="clearfix"></div> <hr> <a href="#/register/student"><i class="fa fa-user fa-5x" style="font-size: 50px" aria-hidden="true"></i></a> <p style="font-family: Calibri; font-size: 100%"><b>Student</b></p> <div class="clearfix"></div> <hr> <a href="#/register/company"><i class="fa fa-building fa-5x" style="font-size: 50px" aria-hidden="true"></i></a> <p style="font-family: Calibri; font-size: 100%"><b>Company</b></p> </div> </div> </div> </div> <div class="col-sm-5"> </div> </div>'),a.put("views/school-register.html",'<div class="row"> <div class="col-sm-4"> </div> <div class="col-sm-4"> <!-- SHOW ERROR/SUCCESS MESSAGES --> <div uib-alert ng-repeat="alert in alerts" ng-class="\'alert-\' + (alert.type || \'warning\')" close="closeAlert($index)">{{alert.msg}} </div> <div uib-alert template-url="alert.html" style="background-color:#fa39c3;color:white"></div> <div class="panel panel-default"> <div class="panel-heading"> <h4>School</h4> </div> <div class="panel-body"> <div class="box box-info"> <div class="box-body"> <!-- FORM --> <form ng-submit="registerSchool()"> <!-- NAME --> <div id="name-group" class="form-group"> <label>Name</label> <input type="text" name="name" class="form-control" placeholder="Name" ng-model="school.name" required> <span class="help-block"></span> </div> <!-- DESCRIPTION --> <div id="name-group" class="form-group"> <label>Description</label> <textarea style="height:125px; resize: none" cols="30" rows="10" name="description" class="form-control" placeholder="Description" ng-model="school.description" required></textarea> <span class="help-block"></span> </div> <!-- TYPE --> <div id="name-group" class="form-group"> <label>Type</label> <input type="text" name="type" class="form-control" placeholder="Type" ng-model="school.type" required> <span class="help-block"></span> </div> <!-- TOTAL STUDENTS --> <div id="name-group" class="form-group"> <label>Total Students</label> <input disabled type="number" name="totalStudents" min="1" class="form-control" placeholder="Total Students" ng-model="school.totalStudents"> <span class="help-block"></span> </div> <!-- ESTABLISHED DATE --> <div id="name-group" class="form-group"> <label>Established Date</label> <input disabled type="text" name="establishedDate" class="form-control" placeholder="Established Date" ng-model="school.establishedDate"> <span class="help-block"></span> </div> <!-- SUBMIT BUTTON --> <button type="submit" class="btn btn-success btn-lg btn-block"> Register </button> </form> <br> <textarea style="height:125px; resize: none" cols="30" rows="10" name="description" class="form-control">{{ school }}</textarea> </div> </div> </div> </div> </div> <div class="col-sm-4"> </div> </div>'),a.put("views/school.html",'<div class="row"> <div class="col-sm-4"> <div class="panel panel-default"> <div class="panel-heading">School</div> <div class="panel-body"> <div class="box box-info"> <div class="box-body"> <div class="col-sm-6"> <div align="center"> <!--<img height="200px" width="200px" src="images/student_profile_nobody.29ae7644.jpg"--> <!--class="img-circle img-responsive">--> <i class="fa fa-graduation-cap fa-5x" aria-hidden="true"></i> <div style="color:#999">click here to change profile image</div> </div> <br> </div> <div class="col-sm-6"> <h4 style="color:#00b1b1">{{school.name}}</h4> </div> <div class="clearfix"></div> <hr style="margin:5px 0 5px 0"> <div class="col-sm-5 col-xs-6 tital"><strong>Id</strong></div> <div class="col-sm-7 col-xs-6">{{school.schoolId}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Type</strong></div> <div class="col-sm-7 col-xs-6">{{school.type}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Established Date</strong></div> <div class="col-sm-7 col-xs-6">{{school.establishedDate | date}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="clearfix"></div> <hr style="margin:5px 0 5px 0"> <div class="col-sm-5 col-xs-6 tital"><strong>Total Students</strong></div> <div class="col-sm-7 col-xs-6">{{school.totalStudents}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Total Views</strong></div> <div class="col-sm-7 col-xs-6">1</div> <div class="clearfix"></div> <div class="bot-border"></div> </div> </div> </div> </div> <div class="panel panel-default"> <div class="panel-heading">Follow</div> <div class="panel-body"> <i class="fa fa-facebook fa-2x"></i> <i class="fa fa-github fa-2x"></i> <i class="fa fa-twitter fa-2x"></i> <i class="fa fa-pinterest fa-2x"></i> <i class="fa fa-google-plus fa-2x"></i> </div> </div> </div> <div class="col-sm-8"> <div class="panel panel-default"> <div class="panel-heading">Description</div> <div class="panel-body"> {{school.description}} </div> </div> </div> </div>'),a.put("views/schools.html",'<table st-table="schoolCollection" st-safe-src="schoolList" class="table table-striped"> <tr> <!-- TODO: add dropdown, filter by location etc --> <th colspan="10"><input st-search="" class="form-control" placeholder="Filter results..." type="text"></th> </tr> <thead> <tr> <th></th> <th st-sort="name" class="st-sort-ascent">School</th> <th st-sort="type" class="st-sort-ascent">Type</th> <th st-sort="description" class="st-sort-ascent">Description</th> <!--<th st-sort="location" class="st-sort-ascent">City</th>--> <!--<th st-sort="location" class="st-sort-ascent">Location</th>--> <th st-sort="establishedDate" class="st-sort-ascent">Established</th> <th st-sort="totalStudents" class="st-sort-ascent">Students</th> <!--<th st-sort="registeredstudents" class="st-sort-ascent">Registered</th>--> <!--<th st-sort="registeredstudents" class="st-sort-ascent">Alumni</th>--> </tr> </thead> <tbody> <tr ng-repeat="school in schoolCollection"> <!-- TODO: load icon --> <td> <i class="fa fa-graduation-cap fa-2x" aria-hidden="true"></i> </td> <td><a ng-href="#/schools/{{school.schoolId}}">{{school.name}}</a></td> <td>{{school.type}}</td> <td>{{school.description}}</td> <!-- TODO: format the location better, some schools have multiple cities --> <!--<td>{{school.city}}</td>--> <!--<td>{{school.provinceorstate + \',\' + school.country}}</td>--> <td>{{school.establishedDate | date}}</td> <td>{{school.totalStudents | number}}</td> <!--<td>0</td>--> <!--<td>0</td>--> </tr> </tbody> </table>'),a.put("views/student-register.html",'<div class="row"> <div class="col-sm-4"> </div> <div class="col-sm-4"> <!-- SHOW ERROR/SUCCESS MESSAGES --> <div uib-alert ng-repeat="alert in alerts" ng-class="\'alert-\' + (alert.type || \'warning\')" close="closeAlert($index)">{{alert.msg}} </div> <div uib-alert template-url="alert.html" style="background-color:#fa39c3;color:white"></div> <div class="panel panel-default"> <div class="panel-heading"> <h4>Student</h4> </div> <div class="panel-body"> <div class="box box-info"> <div class="box-body"> <!-- FORM --> <form ng-submit="registerStudent()"> <!-- FIRST NAME --> <div id="name-group" class="form-group"> <label>First Name</label> <input type="text" name="firstName" class="form-control" placeholder="First Name" ng-model="student.firstName" required> <span class="help-block"></span> </div> <!-- LAST NAME --> <div id="name-group" class="form-group"> <label>Last Name</label> <input type="text" name="lastName" class="form-control" placeholder="Last Name" ng-model="student.lastName" required> <span class="help-block"></span> </div> <!-- USER NAME --> <div id="name-group" class="form-group"> <label>Username</label> <input type="text" name="userName" class="form-control" placeholder="User Name" ng-model="student.userName" required> <span class="help-block"></span> </div> <!-- EMAIL ADDRESS --> <div id="name-group" class="form-group"> <label>Email Address</label> <input type="text" name="emailAddress" class="form-control" placeholder="Email Address" ng-model="student.emailAddress" required> <span class="help-block"></span> </div> <!-- EMPLOYMENT STATUS --> <div id="name-group" class="form-group"> <label>Employment Status</label> <input type="text" name="emailAddress" class="form-control" placeholder="Employment Status" ng-model="student.employmentStatus" required> <span class="help-block"></span> </div> <!--&lt;!&ndash; DESCRIPTION &ndash;&gt;--> <!--<div id="name-group" class="form-group">--> <!--<label>Description</label>--> <!--<textarea style="height:125px; resize: none;" cols="30" rows="10" name="description"--> <!--class="form-control" placeholder="Description" ng-model="student.description"--> <!--required></textarea>--> <!--<span class="help-block"></span>--> <!--</div>--> <!-- SUBMIT BUTTON --> <button type="submit" class="btn btn-success btn-lg btn-block"> Register </button> </form> <br> <textarea style="height:125px; resize: none" cols="30" rows="10" name="description" class="form-control">{{ student }}</textarea> </div> </div> </div> </div> </div> <div class="col-sm-4"> </div> </div>'),a.put("views/student.html",'<div class="row"> <div class="col-sm-4"> <div class="panel panel-default"> <div class="panel-heading">Student</div> <div class="panel-body"> <div class="box box-info"> <div class="box-body"> <div class="col-sm-6"> <div align="center"> <!--<img alt="User Pic" src="images/student_profile_nobody.29ae7644.jpg" class="img-circle img-responsive">--> <i class="fa fa-user fa-5x" aria-hidden="true"></i> <div style="color:#999">click here to change profile image</div> </div> <br> </div> <div class="col-sm-6"> <h4 style="color:#00b1b1">{{student.firstName}} {{student.lastName}}</h4> <span><p>Computer Engineer</p></span> </div> <div class="clearfix"></div> <hr style="margin:5px 0 5px 0"> <div> <div class="col-sm-5 col-xs-6 tital"><strong>Dreams</strong></div> <div class="col-sm-7 col-xs-6">{{student.dreams}}</div> <div class="clearfix"></div> <div class="bot-border"></div> </div> <div class="clearfix"></div> <hr style="margin:5px 0 5px 0"> <div class="col-sm-5 col-xs-6 tital"><strong>Id</strong></div> <div class="col-sm-7 col-xs-6">{{student.studentId}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Username</strong></div> <div class="col-sm-7 col-xs-6">{{student.username}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Email</strong></div> <div class="col-sm-7 col-xs-6">{{student.emailAddress}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Status</strong></div> <div class="col-sm-7 col-xs-6">{{student.employmentStatus}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Gender</strong></div> <div class="col-sm-7 col-xs-6">{{student.gender}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Age</strong></div> <div class="col-sm-7 col-xs-6">{{student.age}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Phone</strong></div> <div class="col-sm-7 col-xs-6">{{student.phoneNumber}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Location</strong></div> <div class="col-sm-7 col-xs-6">Planet Earth</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="clearfix"></div> <hr style="margin:5px 0 5px 0"> <div class="col-sm-5 col-xs-6 tital"><strong>Joined</strong></div> <div class="col-sm-7 col-xs-6">{{student.joinedTimestamp | date}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Last seen</strong></div> <div class="col-sm-7 col-xs-6">{{student.lastLoggedinTimestamp | date}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Karma</strong></div> <div class="col-sm-7 col-xs-6">{{student.karma}}</div> <div class="clearfix"></div> <div class="bot-border"></div> <div class="col-sm-5 col-xs-6 tital"><strong>Total Views</strong></div> <div class="col-sm-7 col-xs-6">{{student.totalViews}}</div> <div class="clearfix"></div> <div class="bot-border"></div> </div> </div> </div> </div> <div class="panel panel-default"> <div class="panel-heading">Showcase</div> <div class="panel-body"> </div> </div> <div class="panel panel-default"> <div class="panel-heading">Follow</div> <div class="panel-body"> <i class="fa fa-facebook fa-2x"></i> <i class="fa fa-github fa-2x"></i> <i class="fa fa-twitter fa-2x"></i> <i class="fa fa-pinterest fa-2x"></i> <i class="fa fa-google-plus fa-2x"></i> <i class="fa fa-twitch fa-2x"></i> </div> </div> </div> <div class="col-sm-8"> <div class="panel panel-default"> <div class="panel-heading">Schools</div> <div class="panel-body"> <i class="fa fa-graduation-cap fa-2x" aria-hidden="true"></i> <i class="fa fa-graduation-cap fa-2x" aria-hidden="true"></i> <i class="fa fa-graduation-cap fa-2x" aria-hidden="true"></i> </div> </div> <div class="panel panel-default"> <div class="panel-heading">Skills</div> <div class="panel-body">{{student.skills}}</div> </div> <div class="panel panel-default"> <div class="panel-heading">Employment History</div> <div class="panel-body">{{student.employmentHistory}}</div> </div> <uib-tabset active="activeForm" style="height: 300px"> <uib-tab index="1" heading="Applications"> <br> applied to job1 job2 job3 </uib-tab> <uib-tab index="2" heading="Shortlist"> <br> like job1 job2 job3 </uib-tab> <uib-tab index="4" heading="Interviews"> <br> job interviews for job1 and job2 </uib-tab> <uib-tab index="5" heading="Offers"> <br> job offers from job1 </uib-tab> <uib-tab index="6" heading="Settings"> <p>update username</p> <p>update email</p> <p>update password</p> <p>deactivate account</p> <p>email notifications</p> <p>timezone</p> <p>privacy</p> <!--<p>Mobile text notifications</p>--> <!--<p>Language settings</p>--> </uib-tab> </uib-tabset> </div> </div>'),
a.put("views/students.html",'<table st-table="rowCollection" st-safe-src="rowList" class="table table-striped"> <tr> <!-- TODO: add dropdown, filter by location etc --> <th colspan="10"><input st-search="" class="form-control" placeholder="Filter results..." type="text"></th> </tr> <thead> <tr> <th></th> <th st-sort="username" class="st-sort-ascent">Username</th> <th st-sort="name" class="st-sort-ascent">Name</th> <th st-sort="emailAddress" class="st-sort-ascent">Email</th> <!--<th st-sort="school" class="st-sort-ascent">School</th>--> <th st-sort="employmentStatus" class="st-sort-ascent">Employment Status</th> <th st-sort="joinedTimestamp" class="st-sort-ascent">Joined</th> </tr> </thead> <tbody> <tr ng-repeat="row in rowCollection"> <!-- TODO: load icon --> <td> <i class="fa fa-user fa-2x" aria-hidden="true"></i> </td> <td><a ng-href="#/students/{{row.studentId}}">{{row.username}}</a></td> <td>{{row.firstName + \' \' + row.lastName}}</td> <td>{{row.emailAddress}}</td> <!--<td>University of Waterloo</td>--> <td>{{row.employmentStatus}}</td> <td>{{row.joinedTimestamp | date}}</td> </tr> </tbody> </table>')}]);