# robot-cljs

A [CLJS](https://github.com/clojure/clojurescript/tree/r2234)-based robot experiment

# Usage

```shell
$ npm i robot-cljs
```

```js
var Robot = require('robot-cljs');

var robot = new Robot();
robot.speak(); //=> beep boop
```

# Build

__Requirements__
  - leiningen

```shell
$ lein cljsbuild once
```

# License

MIT
