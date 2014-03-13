var app2Ctrls = angular.module('app2Ctrls', []);

app2Ctrls.controller('HellCtrl', function ($scope) {
  $scope.emps = [
    {'name': 'Cloak ',
     'age': 50},
    {'name': 'Hell Doot',
     'age': 80},
    {'name': 'God Father',
     'age': 100}
  ];
   $scope.orderProp = 'age';
});


app2Ctrls.controller('UserCtrl', ['$scope', 'UserService', function($scope, UserService) {
   
  UserService.fetch({}, function(data) {
      $scope.friends = data.data;
   });
  
}]);
