# cljs-tests-npm

This is a minimal repo concerning [CLJS-2281](https://dev.clojure.org/jira/browse/CLJS-2281)


## Intall node dependencies
```
lein run -m clojure.main scripts/install_deps.clj
```

## See the issue when running in web browser
Compile with:
```
lein run -m clojure.main scripts/compile_web.clj
```

Open Chrome on the html file in `ressource/public`
```
file:///absolute-path-to-repo/resources/public/index.html
```

Open the javascript console, you should see the error
```
Uncaught Error: Undefined nameToPath for module$$material$base
```

Which seems to be the `goog.require("module$$material$base")` from the file
`resources/publis/js/out/node_module/@material/textfield/foundation.js`

## See the issue when running in node
Compile with:
```
lein run -m clojure.main scripts/compile_node.clj
```

then run with
```
node target/main.js
```

Here node seems to crash on the import statement
```
import {MDCFoundation} from '@material/base';
^^^^^^
SyntaxError: Unexpected token import

```


## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
