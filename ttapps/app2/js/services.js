var AppServices = angular.module('AppServices', ['ngResource']);

AppServices.factory('UserService', ['$resource',
  function($resource){
  var access_token = 'CAACEdEose0cBABJdfD3fnZB2ZBW08TIsDOCBSbSaZAecCRLeDoojnCJQmkNbjJfEfGXydZAkXvWoPpkNVZA8kMoMyN9wMqiDx3cpi8b7p04wDWZAXu6bfdQbPyj1BK34pkCZBhTLkZB4TLhG1iM6nyaGPoIdWaLbCtAhp480QnA4ZCUSFacflCfdGt3oWKpmrSZAQZD';
    return $resource('https://graph.facebook.com/behinddwalls/friends', {}, {
      fetch: {method:'GET' , params:{access_token: access_token} }
    });
  }]);
