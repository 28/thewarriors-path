# thewarriors-path

A tribute to The Warriors movie depicting the path they took through New York.

## Overview

This ClojureScript app uses OpenLayers to display the nodes
representing the key moments of the movie and lines depicting the
path the gang took.

All geo data is in [this](/resources/public/edn/path.edn) file.
Lines are drawn sequentially by reading the nodes. Nodes are divided
in two groups - story and other. For all story nodes additional text
box is displayed on click containing `:name` and `:description`
values. Non-story nodes are used just for line junctions.

## Setup

To get an interactive development environment run:
``` shell
lein figwheel
```

and open your browser at [localhost:3449](http://localhost:3449/).
This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL.

To clean all compiled files:
``` shell
lein clean
```

To create a production build run:
``` shell
lein do clean, cljsbuild once min
```

And open your browser in `resources/public/index.html`. You will not
get live reloading, nor a REPL. 

## License

Copyright © 2020 Dejan Josifović

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the "Software"),
to deal in the Software without restriction, including without limitation
the rights to use, copy, modify, merge, publish, distribute, sublicense,
and/or sell copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included
in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
DEALINGS IN THE SOFTWARE.
