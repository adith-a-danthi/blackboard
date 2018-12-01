<?php
require_once __DIR__ . "/vendor/autoload.php";

$route = new \EasyRoute\Route();

try {
    $route->addMatch('POST', '/teacher/login', __DIR__ . '/controllers/teachers/login.php');


    $route->execute();

} catch (Exception $e) {
}
