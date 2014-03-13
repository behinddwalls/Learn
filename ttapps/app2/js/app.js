var app2 = angular.module('app2', ['app2Ctrls','ngRoute', 'AppServices']);
 
app2.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/home', {
        templateUrl: 'views/home.html',
        controller: 'UserCtrl'
      }).
      when('/friends', {
        templateUrl: 'views/friends.html',
        controller: 'UserCtrl'
      });
  }]);
