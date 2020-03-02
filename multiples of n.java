<!DOCTYPE html>
<!-- saved from url=(0062)https://www.guvi.in/code-kata-main?concept=absolute%20beginner -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>GUVI | Learn to code in your native language</title>

<link rel="icon" href="https://www.guvi.in/images/favicon.ico" type="image/x-icon">
<link href="./multiples of n_files/icon" rel="stylesheet">
<link href="./multiples of n_files/css" rel="stylesheet">
<link href="./multiples of n_files/4.css" rel="stylesheet">
<link href="./multiples of n_files/stylev2.css" rel="stylesheet">
<link href="./multiples of n_files/guviv2.css" rel="stylesheet">
<link href="./multiples of n_files/jBox.all.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="./multiples of n_files/plyrfix.css">
<style type="text/css">@keyframes tawkMaxOpen{0%{opacity:0;transform:translate(0, 30px);;}to{opacity:1;transform:translate(0, 0px);}}@-moz-keyframes tawkMaxOpen{0%{opacity:0;transform:translate(0, 30px);;}to{opacity:1;transform:translate(0, 0px);}}@-webkit-keyframes tawkMaxOpen{0%{opacity:0;transform:translate(0, 30px);;}to{opacity:1;transform:translate(0, 0px);}}#jkhQvtL-1583146979975{outline:none!important;visibility:visible!important;resize:none!important;box-shadow:none!important;overflow:visible!important;background:none!important;opacity:1!important;filter:alpha(opacity=100)!important;-ms-filter:progid:DXImageTransform.Microsoft.Alpha(Opacity1)!important;-moz-opacity:1!important;-khtml-opacity:1!important;top:auto!important;right:10px!important;bottom:0px!important;left:auto!important;position:fixed!important;border:0!important;min-height:0!important;min-width:0!important;max-height:none!important;max-width:none!important;padding:0!important;margin:0!important;-moz-transition-property:none!important;-webkit-transition-property:none!important;-o-transition-property:none!important;transition-property:none!important;transform:none!important;-webkit-transform:none!important;-ms-transform:none!important;width:auto!important;height:auto!important;display:none!important;z-index:2000000000!important;background-color:transparent!important;cursor:auto!important;float:none!important;border-radius:unset!important;pointer-events:auto!important}#v8lwHlI-1583146979976.open{animation : tawkMaxOpen .25s ease!important;}</style><script type="text/javascript" async="" src="https://www.googleadservices.com/pagead/conversion_async.js"></script><script async="" src="./multiples of n_files/modules.e483a7fd5848d79df4ee.js.download" charset="utf-8"></script><style type="text/css">iframe#_hjRemoteVarsFrame {display: none !important; width: 1px !important; height: 1px !important; opacity: 0 !important; pointer-events: none !important;}</style></head>
<body class="">
<main role="main" class="container-fluid code-kata-inner-page" id="code-kata-editor-page">

<header class="row bg-white">

<div class="sidebar-container">
<div id="sidebar" class="sidebar-sticky collapse in shadow-sm sidebar-collapse">
<a class="navbar-brand" href="https://www.guvi.in/index.html">GUVI</a>
<ul class="nav flex-column  main-menu">
<li class="nav-item index-link dashboard-link">
<a class="nav-link" href="https://www.guvi.in/dashboard.html">
<i class="material-icons">home</i>
<span>Home</span>
</a>
</li>
<li class="nav-item courses-link">
<a class="nav-link" href="https://www.guvi.in/courses.html">
<i class="material-icons">video_library</i>
<span>Courses</span>
</a>
</li>
<li class="nav-item code-kata-link">
<a class="nav-link" href="https://www.guvi.in/code-kata.html">
<i class="icon-code-kata"></i>
<span>Codekata</span>
</a>
</li>
<li class="nav-item micro-arc-link">
<a class="nav-link" href="https://www.guvi.in/micro-arc.html">
<i class="icon-micro-arc"></i>
<span>MicroARC</span>
</a>
</li>
<li class="nav-item project-board-link">
<a class="nav-link" href="https://www.guvi.in/project-board.html">
<i class="icon-project-board"></i>
<span>Project Board</span>
</a>
</li>
<li class="nav-item leader-board-link">
<a class="nav-link" href="https://www.guvi.in/leader-board.html">
<i class="icon-leader-board"></i>
<span>Leaderboard</span>
</a>
</li>
<li class="nav-item rewards-link">
<a class="nav-link" href="https://www.guvi.in/rewards.html">
<i class="icon-reward"></i>
<span>Rewards</span>
</a>
</li>
<li class="nav-item bookmarks-link" style="display: none;">
<a class="nav-link" href="https://www.guvi.in/bookmarks.html">
<i class="material-icons">bookmarks</i>
<span>Bookmarks</span>
</a>
</li>
<li class="nav-item jobs-link">
<a class="nav-link" href="https://www.guvi.in/jobs.html">
<i class="material-icons">work</i>
<span>Jobs</span>
</a>
</li>
</ul>

<ul class="nav flex-column code-kata-menu" id="ckMenuTabs" role="tablist">
<li class="nav-item ck-questions-link">
<a class="nav-link" id="ck-questions-tab" data-toggle="tab" href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#ck-questions" role="tab" aria-controls="ck-questions" aria-selected="false">
<i class="icon-ck-questions"></i>
<span>Questions</span>
</a>
</li>

<li class="nav-item ck-github-link">
<a class="nav-link active show" id="ck-github-tab" data-toggle="tab" href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#ck-github" role="tab" aria-controls="ck-github" aria-selected="true">
<i class="icon-ck-github"></i>
<span>github</span>
</a>
</li>


</ul>

</div>
</div>

<nav class="col navbar navbar-expand-md navbar-light">
<button id="sidebarToggle" class="navbar-toggler" type="button" data-toggle="collapse" data-target="#sidebar" aria-controls="sidebar" aria-expanded="false" aria-label="Toggle navigation">
<i class="material-icons">menu</i>
</button>
<a class="navbar-brand visible-md" href="https://www.guvi.in/index.html">
<img src="./multiples of n_files/guvi-logo.png" alt="GUVI : Learn to code in your native language">
</a>

<div class="list-group list-group-horizontal-md user-profile" id="accountGroup">
<button class="btn dropdown notification-box-toggler" data-toggle="collapse" data-target="#notification-box">
<i class="material-icons">notifications</i>
</button>
<button class="btn dropdown account-box-toggler" type="button" data-toggle="collapse" data-target="#account-box" aria-expanded="false" aria-controls="account-box">
<div class="gravatar-wrap"><img src="./multiples of n_files/default.jpg" class="gravatar"></div>
</button>
<div class="accordion-group">

<div class="collapse notification-box shadow-sm" id="notification-box" data-parent="#accountGroup">
<div class="card card-body">
<ul class="list-group">
No notifications
</ul>
</div>
</div>


<div class="collapse account-box shadow-sm" id="account-box" data-parent="#accountGroup">
<div class="card card-body"><div class="d-flex flex-row border-bottom mb-2"><div class="gravatar-wrap mr-2"><img src="./multiples of n_files/default.jpg" class="gravatar"></div><div class="account-info"><p class="mb-0">shakila arunachalam</p><p class="mb-0"><a href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#">null</a></p><p class="mb-0 highlight"><a href="https://www.guvi.in/shakila2133">View profile</a></p></div></div><div class="d-flex flex-row mb-2pb-2 score-card" id="mainNavDefault" style="line-height: 2.5em;"><p class="experience"><i class="icon-geekoin" aria-hidden="true">Geekoin:</i><span>60</span></p><p class="rank" style="border-right:0;"><strong>Rank:</strong><span>N/A</span></p><p class="level" style="display:none;"><strong>Level:</strong><i class="icon-level"><span>01</span></i></p></div><!-- /ScoreCard --><ul class="list-group list-group-flush account-links-group"><li class="list-group-item account-links highlight"><strong><a href="https://www.guvi.in/change-password.html">Change Password</a></strong></li><li class="list-group-item account-links"><a href="javascript:authorize.signout();" id="signout">Sign out</a></li></ul></div>
</div>

</div>
</div>

</nav>
</header>


<div class="row">
<div class="col-sm-12 offset-md-1 col-md-11">

<div class="btn-group btn-breadcrumb">
<a href="https://www.guvi.in/dashboard.html" class="btn btn-default"><i class="material-icons">home</i></a>
<a href="https://www.guvi.in/code-kata.html" class="btn btn-default">CODEKATA</a>
<a href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#" class="btn btn-default  number-id-wrap">absolute beginner<span class="number-id has-success">774</span></a>
</div>

</div>
</div>
<div class="row">
<div class="col-sm-12 offset-md-1 col-md-11 bodyContainer" style="padding-bottom: 0px;">
<div class="row">
<div class="col-md-5">

<div class="tab-content ck-menu-tabs-content" id="ckMenuTabsContent">

<div class="tab-pane fade" id="ck-questions" role="tabpanel" aria-labelledby="ck-questions-tab">
<div class="panel-header">
<div class="d-flex flex-row justify-content-start">
<h2 class="panel-title number-id-wrap pr-1">absolute beginner<span class="number-id has-success">774</span></h2>
<button class="btn pt-2" data-toggle="tooltip" data-html="true" title="" data-placement="right" data-original-title="
                                            &lt;div class=&#39;row d-flex mt-0&#39;&gt;
                                                &lt;div class=&#39;col d-flex justify-content-start&#39;&gt;
                                                    &lt;i class=&#39;material-icons text-primary pr-1&#39;&gt;fiber_manual_record&lt;/i&gt;
                                                    &lt;p&gt;Completed&lt;/p&gt;
                                                &lt;/div&gt;
                                            &lt;/div&gt;
                                            &lt;div class=&#39;row d-flex mt-0&#39;&gt;
                                                &lt;div class=&#39;col d-flex justify-content-start&#39;&gt;
                                                    &lt;i class=&#39;material-icons text-danger pr-1&#39;&gt;fiber_manual_record&lt;/i&gt;
                                                    &lt;p&gt;Incomplete&lt;/p&gt;
                                                &lt;/div&gt;
                                            &lt;/div&gt;
                                            &lt;div class=&#39;row d-flex mt-0&#39;&gt;
                                                &lt;div class=&#39;col d-flex justify-content-start&#39;&gt;
                                                    &lt;i class=&#39;material-icons text-muted pr-1&#39;&gt;fiber_manual_record&lt;/i&gt;
                                                    &lt;p&gt;Not Attended&lt;/p&gt;
                                                &lt;/div&gt;
                                            &lt;/div&gt;">
<small><i class="material-icons">info</i></small>
</button>
</div>

<ul class="list-unstyled d-flex flex-row justify-content-end secondary-links">
<li class="share-link"><a href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#"><i class="fas fa-share-alt"></i><span>Share</span></a></li>
<li>
<a target="_blank" href="https://www.guvi.in/ide.html" class="d-flex align-items-center">
<span class="font-weight-bold">IDE</span>
<span class="material-icons text-warning">fiber_new</span>
</a>
</li>

</ul>

</div>
<div class="panel-content">
<p id="codeKataQuestions"><p>Print the First 3&nbsp;multiples of the given number "<strong>N</strong>". (<strong>N</strong> is a positive integer)</p>

<p>Note: print the characters with a single space between them.</p>
</p>
<div id="inputDescription"><p><strong>Input Description:</strong><br> A positive integer is provided to you as an input.</p></div>
<div id="outputDescription"><p><strong>Output Description:</strong><br> Print the First 3 multiples of the number with single spaces between them as an output.</p></div>
<div id="sampleInput"><pre><strong>Sample Input :</strong><br>2</pre></div>
<div id="sampleOutput"><pre><strong>Sample Output :</strong><br>2 4 6</pre></div>
</div>
</div>


<div class="tab-pane fade" id="ck-instructions" role="tabpanel" aria-labelledby="ck-instructions-tab">
<div class="panel-header">
<h2 class="panel-title number-id-wrap">absolute beginner<span class="number-id has-success">774</span></h2>

<ul class="list-unstyled d-flex flex-row justify-content-end secondary-links">
<li class="share-link"><a href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#"><i class="fas fa-share-alt"></i><span>Share</span></a></li>
<li>
<a target="_blank" href="https://www.guvi.in/ide.html" class="d-flex align-items-center">
<span class="font-weight-bold">IDE</span>
<span class="material-icons text-warning">fiber_new</span>
</a>
</li>

</ul>

</div>
 <div class="panel-content">
<p id="programExplain">The first 3 multiples of 2 are
2*1 = 2
2*2 = 4
2*3 = 6
printing them with single spaces gives:
2 4 6</p>
</div>
</div>


<div class="tab-pane fade active show" id="ck-github" role="tabpanel" aria-labelledby="ck-github-tab">
<div class="panel-header">
<div class="d-flex flex-row justify-content-start">
<h2 class="panel-title number-id-wrap pr-1">absolute beginner<span class="number-id has-success">774</span></h2>

<button class="btn pt-2" data-toggle="tooltip" data-html="true" title="" data-placement="right" data-original-title="
                                                &lt;div class=&#39;row d-flex mt-0&#39;&gt;
                                                    &lt;div class=&#39;col d-flex justify-content-start&#39;&gt;
                                                        &lt;i class=&#39;material-icons text-primary pr-1&#39;&gt;fiber_manual_record&lt;/i&gt;
                                                        &lt;p&gt;Completed&lt;/p&gt;
                                                    &lt;/div&gt;
                                                &lt;/div&gt;
                                                &lt;div class=&#39;row d-flex mt-0&#39;&gt;
                                                    &lt;div class=&#39;col d-flex justify-content-start&#39;&gt;
                                                        &lt;i class=&#39;material-icons text-danger pr-1&#39;&gt;fiber_manual_record&lt;/i&gt;
                                                        &lt;p&gt;Incomplete&lt;/p&gt;
                                                    &lt;/div&gt;
                                                &lt;/div&gt;
                                                &lt;div class=&#39;row d-flex mt-0&#39;&gt;
                                                    &lt;div class=&#39;col d-flex justify-content-start&#39;&gt;
                                                        &lt;i class=&#39;material-icons text-muted pr-1&#39;&gt;fiber_manual_record&lt;/i&gt;
                                                        &lt;p&gt;Not Attended&lt;/p&gt;
                                                    &lt;/div&gt;
                                                &lt;/div&gt;">
<small><i class="material-icons">info</i></small>
</button>
</div>
<ul class="list-unstyled d-flex flex-row justify-content-end secondary-links">
<li class="share-link"><a href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#"><i class="fas fa-share-alt"></i><span>Share</span></a></li>
<li>
<a target="_blank" href="https://www.guvi.in/ide.html" class="d-flex align-items-center">
<span class="font-weight-bold">IDE</span>
<span class="material-icons text-warning">fiber_new</span>
</a>
</li>

</ul>

</div>
<div class="panel-content">


<form id="gitSubmit">
<div class="form-group">
<label for="ghLanguageSelect">Language used</label>
<select class="form-control is-invalid" name="ghLanguageSelect" id="ghLanguageSelect" required=""><option value="shell">BASH</option><option value="clike">BASIC</option><option value="clike">C</option><option value="clike">CLOJURE</option><option value="clike">CRYSTAL</option><option value="clike">C++</option><option value="clike">C#</option><option value="clike">ELIXIR</option><option value="clike">ERLANG</option><option value="go">GO</option><option value="clike">HASKELL</option><option value="clike">INSECT</option><option value="clike">JAVA</option><option value="clike">JAVA 8</option><option value="javascript">JAVASCRIPT</option><option value="clike">OCAML</option><option value="clike">OCTAVE</option><option value="clike">PASCAL</option><option value="python">PYTHON 2</option><option value="python">PYTHON 3</option><option value="ruby">RUBY</option><option value="clike">RUST</option></select>
</div>
<div class="form-group">
<label for="ghgithuburl">Your Github URL</label>
<input type="url" class="form-control is-invalid" id="ghgithuburl" aria-describedby="emailHelp" placeholder="Github URL" required="">
<small id="ghHelp" class="form-text help text-danger">Given language and file extension does not match, Please select the language from the suggestions</small>
</div>
<div class="form-group">
<label>
Positive Testcase Input &amp; Output
<button type="button" class="btn " data-toggle="tooltip" data-placement="auto" data-html="true" title="" data-original-title="&lt;div&gt;&lt;p&gt;Eg., write a program to add two integer&lt;/p&gt;
            &lt;strong&gt;Positive testcase :&lt;/strong&gt;
            &lt;p&gt;Input : (25, 25) &lt;br/&gt; Output : 50 &lt;/p&gt;&lt;/div&gt;">
<i class="material-icons">info</i>
</button>
</label>
<div class="form-row">
<div class="col">
<textarea id="pInput" class="form-control" placeholder="Input" required=""></textarea>
</div>
<div class="col">
<textarea id="pOutput" class="form-control" placeholder="Output" required=""></textarea>
</div>
</div>
</div>
<div class="form-group">
<label>Negative Testcase Input &amp; Output
<button type="button" class="btn " data-toggle="tooltip" data-placement="auto" data-html="true" title="" data-original-title="&lt;div&gt;&lt;p&gt;Eg., write a program to add two integer&lt;/p&gt;
            &lt;strong&gt;Negative testcase :&lt;/strong&gt;
            &lt;p&gt;Input : (25, A) &lt;br/&gt; Output : Input error &lt;/p&gt;&lt;/div&gt;">
<i class="material-icons">info</i>
</button>
</label>
<div class="form-row">
<div class="col">
<textarea id="nInput" class="form-control" placeholder="Input" required=""></textarea>
</div>
<div class="col">
<textarea id="nInput" class="form-control" placeholder="Output" required=""></textarea>
</div>
</div>
</div>
<div class="d-flex justify-content-end btn-wrap">
<button type="submit" class="btn btn-primary">Submit</button>
</div>
</form>

</div>
</div>


<div class="tab-pane fade" id="ck-peer-submission" role="tabpanel" aria-labelledby="ck-peer-submission-tab">
<div class="panel-header">
<h2 class="panel-title number-id-wrap">absolute beginner<span class="number-id has-success">774</span></h2>

<ul class="list-unstyled d-flex flex-row justify-content-end secondary-links">
<li class="share-link"><a href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#"><i class="fas fa-share-alt"></i><span>Share</span></a></li>
<li>
<a target="_blank" href="https://www.guvi.in/ide.html" class="d-flex align-items-center">
<span class="font-weight-bold">IDE</span>
<span class="material-icons text-warning">fiber_new</span>
</a>
</li>

</ul>

</div>
<div class="panel-content">

<ul class="list-group peer-submission-list">
<li class="list-group-item">
<div class="gravatar-wrap">
<img src="./multiples of n_files/profile-pic-sample.jpeg" class="gravatar" alt="david_lee">
</div>
<p>
<strong class="peer">David Lee</strong>
<a class="source-code" href="https://github.com/15EC046/Guvi-Beginner/Blob/Mast">https://Github.Com/15EC046/Guvi-Beginner/Blob/Mast</a>
</p>
<span class="likes">13K</span>
</li>
<li class="list-group-item">
<div class="gravatar-wrap">
<img src="./multiples of n_files/profile-pic-sample.jpeg" class="gravatar" alt="david_lee">
</div>
<p>
<strong class="peer">David Lee</strong>
<a class="source-code" href="https://github.com/15EC046/Guvi-Beginner/Blob/Mast">https://Github.Com/15EC046/Guvi-Beginner/Blob/Mast</a>
</p>
<span class="likes">13K</span>
</li>
<li class="list-group-item">
<div class="gravatar-wrap">
<img src="./multiples of n_files/profile-pic-sample.jpeg" class="gravatar" alt="david_lee">
</div>
<p>
<strong class="peer">David Lee</strong>
<a class="source-code" href="https://github.com/15EC046/Guvi-Beginner/Blob/Mast">https://Github.Com/15EC046/Guvi-Beginner/Blob/Mast</a>
</p>
<span class="likes">13K</span>
</li>
</ul>

</div>
</div>


<div class="tab-pane fade" id="ck-path" role="tabpanel" aria-labelledby="ck-path-tab">
<div class="panel-header">
<h2 class="panel-title number-id-wrap">absolute beginner<span class="number-id has-success">774</span></h2>

<ul class="list-unstyled d-flex flex-row justify-content-end secondary-links">
<li class="share-link"><a href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#"><i class="fas fa-share-alt"></i><span>Share</span></a></li>
<li>
<a target="_blank" href="https://www.guvi.in/ide.html" class="d-flex align-items-center">
<span class="font-weight-bold">IDE</span>
<span class="material-icons text-warning">fiber_new</span>
</a>
</li>

</ul>

</div>
<div class="panel-content">
</div>
</div>

</div>


<ul class="list-unstyled d-flex flex-row justify-content-between navigator">
<li><a href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#" id="codePre" class="btn previous disabled">Previous</a></li>
<li><a href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner" id="codeSkip" class="btn">Skip</a></li>

<li><a href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#" id="codeNext" class="btn next">Next</a></li>
</ul>

</div>
<div class="col-md-7 split-wrap">
<div id="codeEditorWrap" class="split  resizable code-editor-wrap" style="height: calc(70% - 0px);">
<div class="panel-header">
<h2 class="panel-title">Code Editor</h2>
<div class="editor-filters-wrap">
<select id="editorThemeSelect" class="btn btn-outline-dark">
<option value="default" selected="selected">default</option>
<option value="darcula">darcula</option>
</select>
<select id="editorModeSelect" class="btn btn-outline-dark"><option value="shell">BASH</option><option value="clike">BASIC</option><option value="clike">C</option><option value="clike">CLOJURE</option><option value="clike">CRYSTAL</option><option value="clike">C++</option><option value="clike">C#</option><option value="clike">ELIXIR</option><option value="clike">ERLANG</option><option value="go">GO</option><option value="clike">HASKELL</option><option value="clike">INSECT</option><option value="clike">JAVA</option><option value="clike">JAVA 8</option><option value="javascript">JAVASCRIPT</option><option value="clike">OCAML</option><option value="clike">OCTAVE</option><option value="clike">PASCAL</option><option value="python">PYTHON 2</option><option value="python">PYTHON 3</option><option value="ruby">RUBY</option><option value="clike">RUST</option></select>
</div>
</div>
<textarea rows="4" cols="50" id="editor" name="editor" style="display: none;"></textarea><div class="CodeMirror cm-s-default"><div style="overflow: hidden; position: relative; width: 3px; height: 0px; top: 193px; left: 41.7031px;"><textarea autocorrect="off" autocapitalize="off" spellcheck="false" tabindex="0" style="position: absolute; bottom: -1em; padding: 0px; width: 1000px; height: 1em; outline: none;"></textarea></div><div class="CodeMirror-vscrollbar" tabindex="-1" cm-not-content="true"><div style="min-width: 1px; height: 0px;"></div></div><div class="CodeMirror-hscrollbar" tabindex="-1" cm-not-content="true"><div style="height: 100%; min-height: 1px; width: 0px;"></div></div><div class="CodeMirror-scrollbar-filler" cm-not-content="true"></div><div class="CodeMirror-gutter-filler" cm-not-content="true"></div><div class="CodeMirror-scroll" tabindex="-1" draggable="false"><div class="CodeMirror-sizer" style="margin-left: 30px; margin-bottom: -17px; border-right-width: 13px; min-height: 218px; min-width: 353.516px; padding-right: 0px; padding-bottom: 0px;"><div style="position: relative; top: 0px;"><div class="CodeMirror-lines" role="presentation"><div role="presentation" style="position: relative; outline: none;"><div class="CodeMirror-measure"><pre>x</pre></div><div class="CodeMirror-measure"></div><div style="position: relative; z-index: 1;"><div class="CodeMirror-selected" style="position: absolute; left: 4px; top: 0px; width: 460px; height: 21px;"></div><div class="CodeMirror-selected" style="position: absolute; left: 4px; top: 189px; width: 7.70313px; height: 21px;"></div><div class="CodeMirror-selected" style="position: absolute; left: 4px; top: 21px; width: 460px; height: 168px;"></div></div><div class="CodeMirror-cursors" style="visibility: hidden;"></div><div class="CodeMirror-code" role="presentation" style=""><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -30px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-variable">import</span> <span class="cm-variable">java</span>.<span class="cm-variable">util</span>.<span class="cm-variable">Scanner</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -30px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">2</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-variable">public</span> <span class="cm-variable">class</span> <span class="cm-variable">Main</span> {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -30px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">3</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">    <span class="cm-variable">public</span> <span class="cm-variable">static</span> <span class="cm-variable">void</span> <span class="cm-variable">main</span>(<span class="cm-variable">String</span>[] <span class="cm-variable">args</span>) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -30px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">4</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">      <span class="cm-variable">Scanner</span> <span class="cm-variable">s</span> <span class="cm-operator">=</span> <span class="cm-variable">new</span> <span class="cm-variable">Scanner</span>(<span class="cm-variable">System</span>.<span class="cm-variable">in</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -30px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">5</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">      <span class="cm-variable">int</span> <span class="cm-variable">n</span> <span class="cm-operator">=</span> <span class="cm-variable">s</span>.<span class="cm-variable">nextInt</span>();</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -30px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">6</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">       <span class="cm-variable">System</span>.<span class="cm-variable">out</span>.<span class="cm-variable">print</span>(<span class="cm-number">1</span><span class="cm-operator">*</span><span class="cm-variable">n</span><span class="cm-operator">+</span><span class="cm-string">" "</span><span class="cm-operator">+</span><span class="cm-number">2</span><span class="cm-operator">*</span><span class="cm-variable">n</span><span class="cm-operator">+</span><span class="cm-string">" "</span><span class="cm-operator">+</span><span class="cm-number">3</span><span class="cm-operator">*</span><span class="cm-variable">n</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -30px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">7</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">      </span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -30px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">8</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">      </span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -30px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">9</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">    }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -30px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">10</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">}</span></pre></div></div></div></div></div></div><div style="position: absolute; height: 13px; width: 1px; border-bottom: 0px solid transparent; top: 218px;"></div><div class="CodeMirror-gutters" style="height: 231px; left: 0px;"><div class="CodeMirror-gutter CodeMirror-linenumbers" style="width: 29px;"></div></div></div></div>
</div>
<div class="gutter gutter-vertical" style="height: 20px;"></div><div id="outputPanelWrap" class="split  resizable output-panel-wrap" style="height: calc(30% - 20px);">
<div class="d-flex justify-content-between btn-wrap">
<button id="runCode" class="btn btn-outline-dark">Run code
<span id="runCount" class="badge badge-secondary">99</span>
</button>
<button class="btn btn-primary" id="submitCode">Submit</button>
</div>

<ul class=" nav nav-tabs output-panel-tabs" id="outputPanelTabs" role="tablist">
<li class="nav-item">
<a class="nav-link codeInput" id="console-panel-tab" data-toggle="tab" href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#console-panel" role="tab" aria-controls="console-panel" aria-selected="false">Input</a>
</li>
<li class="nav-item">
<a class="nav-link active show" id="testcase-panel-tab" data-toggle="tab" href="https://www.guvi.in/code-kata-main?concept=absolute%20beginner#testcase-panel" role="tab" aria-controls="testcase-panel" aria-selected="true">Output</a>
</li>
</ul>


<div class="tab-content" id="outputPanelTabsContent">
<div class="tab-pane fade" id="console-panel" role="tabpanel" aria-labelledby="console-panel-tab">

<div class="card text-left console-panel">
<div class="card-body video-notes-tab" id="inputData" style="height: calc(28vh);">
<textarea id="customInput" placeholder="Enter Your Input"></textarea>
</div>
</div>

</div>
<div class="tab-pane fade active show" id="testcase-panel" role="tabpanel" aria-labelledby="testcase-panel-tab">

<div class="card text-left console-panel">
<div class="card-body" id="outputData" style="height: calc(28vh);"><div id="offset"><pre><b>&gt;&gt;&gt;</b> Compiling your code</pre><h5>Output: </h5><pre>Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextInt(Scanner.java:2117)
	at java.util.Scanner.nextInt(Scanner.java:2076)
	at Main.main(Main.java:5)


Runtime Error (NZEC)</pre><h5>Execution Time:</h5><pre><b>&gt;&gt;&gt; </b>0.105s</pre><h5>Memory Used: </h5><pre><b>&gt;&gt;&gt; </b>10408kb</pre></div></div>
</div>







</div>
</div>

</div>
</div>
</div>
</div>
</div>

</main>
<div class="spinner spinner-border text-dark" role="status" style="display: none;">
<span class="sr-only">Loading...</span>
</div>

<div id="freeUserModal" class="modal fade" tabindex="-1" role="dialog">
<div class="modal-dialog modal-lg modal-dialog-centered">
<div class="modal-content">
<div class="modal-header">
<button type="button" class="close" data-dismiss="modal" aria-label="close">
 <span aria-hidden="true">×</span>
</button>
</div>
<div class="modal-body">
<div class="d-flex flex-row justify-content-center mb-3">
<div>
<h5 class="text-center">To access all the remaining questions</h5>
<h5 class="text-center">Become a Premium member by purchasing our courses</h5>
</div>
</div>
<div class="row justify-content-center">
<div class="col-md-12 col-lg-6 col-xl-5">
<div class="card shadow codekata-card">
<div class="card-header basic-header d-flex justify-content-center before-card rounded-bottom">
<strong class="text-white">Free Membership</strong>
</div>
<div class="card-body">
<div class="d-flex justify-content-between">
<div class="d-flex justify-content-start">
<i class="fas fa-check-circle mt-1 mr-2 text-primary"></i>
<p class="font-weight-bold">Codekata</p>
</div>
<p class="font-weight-bold">Limited Access</p>
</div>
<div class="d-flex justify-content-between">
<div class="d-flex justify-content-start">
<i class="fas fa-check-circle mt-1 mr-2 text-primary"></i>
<p class="font-weight-bold">MicroARC</p>
</div>
<p class="font-weight-bold">Limited Access</p>
</div>
</div>
</div>
</div>
<div class="col-md-12 col-lg-6 col-xl-5">
<div class="card shadow codekata-card">
<div class="card-header premium-header d-flex justify-content-center after-card rounded-bottom">
<strong class="text-white">Premium Membership</strong>
</div>
<div class="card-body">
<div class="d-flex justify-content-between">
<div class="d-flex justify-content-start">
<i class="fas fa-check-circle mt-1 mr-2 text-primary"></i>
<p class="font-weight-bold">Codekata</p>
</div>
<p class="font-weight-bold">Unlimited Access</p>
</div>
<div class="d-flex justify-content-between">
<div class="d-flex justify-content-start">
<i class="fas fa-check-circle mt-1 mr-2 text-primary"></i>
<p class="font-weight-bold">MicroARC</p>
</div>
<p class="font-weight-bold">Unlimited Access</p>
</div>
</div>
</div>
</div>
</div>
<div class="d-flex flex-row justify-content-center mt-3">
<a id="subscriptionGoToCourses">
<button type="button" class="btn btn-primary rounded-button pl-5 pr-5">Go to Courses</button>
</a>
</div>
</div>
</div>
</div>
</div>


<div class="modal fade" id="githubVideoModal" tabindex="-1" role="dialog" aria-hidden="true">
<div class="modal-dialog modal-dialog-centered modal-lg" role="document">
<div class="modal-content">
<div class="githubValidate">
</div>
<div class="modal-footer">
<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
</div>
</div>
</div>
</div>
<div class="modal fade" id="github">
<div class="modal-dialog">
<div class="modal-content">

<div class="modal-header">
<h4 class="modal-title"></h4>
<button type="button" class="close" data-dismiss="modal">×</button>
</div>

<div class="modal-body">
</div>

<div class="modal-footer">
<button type="button" id="githubSubmit" class="btn btn btn-primary" data-dismiss="modal">Submit</button>
<button type="button" class="btn btn btn-default" data-dismiss="modal">Close</button>
</div>
</div>
</div>
</div>


<div class="modal fade wishes-modal" id="preassessmentCompletionModal" tabindex="-1" role="dialog" aria-hidden="true" style="display: none;"><div class="modal-dialog modal-dialog-centered modal-lg" role="document"><div class="modal-content"><div class="modal-header"><h5><strong> 10 </strong>Congratulations</h5></div><div class="modal-body"><p class="message"> <strong>Earned 10 Geekoins</strong> Use G Coins to redeems exciting rewards and gifts </p><br><div class="d-flex justify-content-center"><button id="startPreassess" class="btn btn-primary" data-dismiss="modal">Continue</button></div></div></div></div></div>


<div class="modal fade" id="allQuestionsModal" tabindex="-1" role="dialog" aria-labelledby="allQuestionsModal" aria-hidden="true">
<div class="modal-dialog modal-dialog-slideout" role="document">
<div class="modal-content">
<div class="modal-header">
<h5 class="modal-title" id="allQuestionsModalLabel">Attended Questions</h5>
<button type="button" class="close" data-dismiss="modal" aria-label="Close">
<span aria-hidden="true">×</span>
</button>
</div>
<div class="modal-body">
<div class="d-flex flex-wrap" id="attendedMarkup">

</div>
</div>
<div class="modal-footer">
<div class="d-flex justify-content-around">
<div class=" d-flex justify-content-center align-items-center">
<span class="indication-ball not-attended-indication m-2"></span>
<span class="status-text">Not Attended</span>
</div>
<div class=" d-flex justify-content-center align-items-center">
<span class="indication-ball not-completed-indication m-2"></span>
 <span class="status-text">Not Completed</span>
</div>
<div class=" d-flex justify-content-center align-items-center">
<span class="indication-ball completed-indication m-2"></span>
<span class="status-text">Completed</span>
</div>
</div>
</div>
</div>
</div>
</div>
<script type="text/javascript" async="" src="./multiples of n_files/d33b0ed6a255469ca34f228055905e25.js.download"></script><script src="./multiples of n_files/2421896964801907" async=""></script><script async="" src="./multiples of n_files/fbevents.js.download"></script><script type="text/javascript" async="" src="./multiples of n_files/hotjar-1193847.js.download"></script><script type="text/javascript" async="" src="./multiples of n_files/analytics.js.download"></script><script async="" src="./multiples of n_files/default" charset="UTF-8" crossorigin="*"></script><script async="" src="./multiples of n_files/analytics.js.download"></script><script async="" src="./multiples of n_files/gtm.js.download"></script><script src="./multiples of n_files/jquery.min.js.download"></script>
<script src="./multiples of n_files/jBox.all.min.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/popper.min.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/bootstrap.min.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/split.min.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/codemirror.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/clike.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/go.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/javascript.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/htmlmixed.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/python.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/shell.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/ruby.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/perl.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/code-kata-main.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/steroid.js.download"></script>

<script type="text/javascript" src="./multiples of n_files/codekataClass.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/codekataConcept.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/codekataOperations.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/codekataTimer.js.download"></script>
<script type="text/javascript" src="./multiples of n_files/googleAnalytics.js.download"></script>



<script type="text/javascript" id="">!function(b,e,f,g,a,c,d){b.fbq||(a=b.fbq=function(){a.callMethod?a.callMethod.apply(a,arguments):a.queue.push(arguments)},b._fbq||(b._fbq=a),a.push=a,a.loaded=!0,a.version="2.0",a.queue=[],c=e.createElement(f),c.async=!0,c.src=g,d=e.getElementsByTagName(f)[0],d.parentNode.insertBefore(c,d))}(window,document,"script","https://connect.facebook.net/en_US/fbevents.js");fbq("init","2421896964801907");fbq("track","PageView");</script>
<noscript><img height="1" width="1" style="display:none" src="https://www.facebook.com/tr?id=2421896964801907&amp;ev=PageView&amp;noscript=1"></noscript>
<script type="text/javascript" id="">(function(a,b){a=document.createElement("script");a.type="text/javascript";a.async=!0;a.src="https://cdn-in.pagesense.io/js/guvi/d33b0ed6a255469ca34f228055905e25.js";b=document.getElementsByTagName("script")[0];b.parentNode.insertBefore(a,b)})(window,"script");</script>
<script type="text/javascript" id="" src="./multiples of n_files/js"></script><div id="jkhQvtL-1583146979975" class="" style="display: block !important;"><iframe id="v8lwHlI-1583146979976" src="./multiples of n_files/saved_resource.html" frameborder="0" scrolling="no" title="chat widget" class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; top: auto !important; right: auto !important; bottom: auto !important; left: auto !important; position: static !important; border: 0px !important; min-height: auto !important; min-width: auto !important; max-height: none !important; max-width: none !important; padding: 0px !important; margin: 0px !important; transition-property: none !important; transform: none !important; width: 350px !important; z-index: 999999 !important; cursor: auto !important; float: none !important; border-radius: unset !important; pointer-events: auto !important; display: none !important; height: 120px !important;"></iframe><iframe id="ZTTBHdZ-1583146979976" src="./multiples of n_files/saved_resource(1).html" frameborder="0" scrolling="no" title="chat widget" class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; position: fixed !important; border: 0px !important; padding: 0px !important; transition-property: none !important; z-index: 1000001 !important; cursor: auto !important; float: none !important; pointer-events: auto !important; height: 40px !important; min-height: 40px !important; max-height: 40px !important; width: 280px !important; min-width: 280px !important; max-width: 280px !important; border-radius: 0px !important; transform: rotate(0deg) translateZ(0px) !important; transform-origin: 0px center !important; margin: 0px !important; top: auto !important; bottom: 0px !important; right: 10px !important; left: auto !important; display: block !important;"></iframe><iframe id="neMILsO-1583146979976" src="./multiples of n_files/saved_resource(2).html" frameborder="0" scrolling="no" title="chat widget" class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; position: fixed !important; border: 0px !important; padding: 0px !important; margin: 0px !important; transition-property: none !important; transform: none !important; display: none !important; z-index: 1000003 !important; cursor: auto !important; float: none !important; border-radius: unset !important; pointer-events: auto !important; top: auto !important; bottom: 25px !important; right: 1px !important; left: auto !important; width: 21px !important; max-width: 21px !important; min-width: 21px !important; height: 21px !important; max-height: 21px !important; min-height: 21px !important;"></iframe><div class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; top: 0px !important; right: auto !important; bottom: auto !important; left: 0px !important; position: absolute !important; border: 0px !important; min-height: auto !important; min-width: auto !important; max-height: none !important; max-width: none !important; padding: 0px !important; margin: 0px !important; transition-property: none !important; transform: none !important; width: 100% !important; height: 100% !important; display: none !important; z-index: 1000001 !important; cursor: move !important; float: left !important; border-radius: unset !important; pointer-events: auto !important;"></div><div id="UlzYZVG-1583146979975" class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; top: 0px !important; right: auto !important; bottom: auto !important; left: 0px !important; position: absolute !important; border: 0px !important; min-height: auto !important; min-width: auto !important; max-height: none !important; max-width: none !important; padding: 0px !important; margin: 0px !important; transition-property: none !important; transform: none !important; width: 6px !important; height: 100% !important; display: block !important; z-index: 999998 !important; cursor: w-resize !important; float: none !important; border-radius: unset !important; pointer-events: auto !important;"></div><div id="daMuUNv-1583146979975" class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; top: 0px !important; right: 0px !important; bottom: auto !important; left: auto !important; position: absolute !important; border: 0px !important; min-height: auto !important; min-width: auto !important; max-height: none !important; max-width: none !important; padding: 0px !important; margin: 0px !important; transition-property: none !important; transform: none !important; width: 6px !important; height: 100% !important; display: block !important; z-index: 999998 !important; cursor: e-resize !important; float: none !important; border-radius: unset !important; pointer-events: auto !important;"></div><div id="iItGuCV-1583146979975" class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; top: 0px !important; right: 0px !important; bottom: auto !important; left: auto !important; position: absolute !important; border: 0px !important; min-height: auto !important; min-width: auto !important; max-height: none !important; max-width: none !important; padding: 0px !important; margin: 0px !important; transition-property: none !important; transform: none !important; width: 100% !important; height: 6px !important; display: block !important; z-index: 999998 !important; cursor: n-resize !important; float: none !important; border-radius: unset !important; pointer-events: auto !important;"></div><div id="krz2KUE-1583146979975" class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; top: auto !important; right: 0px !important; bottom: 0px !important; left: auto !important; position: absolute !important; border: 0px !important; min-height: auto !important; min-width: auto !important; max-height: none !important; max-width: none !important; padding: 0px !important; margin: 0px !important; transition-property: none !important; transform: none !important; width: 100% !important; height: 6px !important; display: block !important; z-index: 999998 !important; cursor: s-resize !important; float: none !important; border-radius: unset !important; pointer-events: auto !important;"></div><div id="tCA03nl-1583146979975" class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; top: 0px !important; right: auto !important; bottom: auto !important; left: 0px !important; position: absolute !important; border: 0px !important; min-height: auto !important; min-width: auto !important; max-height: none !important; max-width: none !important; padding: 0px !important; margin: 0px !important; transition-property: none !important; transform: none !important; width: 12px !important; height: 12px !important; display: block !important; z-index: 999998 !important; cursor: nw-resize !important; float: none !important; border-radius: unset !important; pointer-events: auto !important;"></div><div id="kON34JX-1583146979975" class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; top: 0px !important; right: 0px !important; bottom: auto !important; left: auto !important; position: absolute !important; border: 0px !important; min-height: auto !important; min-width: auto !important; max-height: none !important; max-width: none !important; padding: 0px !important; margin: 0px !important; transition-property: none !important; transform: none !important; width: 12px !important; height: 12px !important; display: block !important; z-index: 999998 !important; cursor: ne-resize !important; float: none !important; border-radius: unset !important; pointer-events: auto !important;"></div><div id="RiibVAB-1583146979975" class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; top: auto !important; right: auto !important; bottom: 0px !important; left: 0px !important; position: absolute !important; border: 0px !important; min-height: auto !important; min-width: auto !important; max-height: none !important; max-width: none !important; padding: 0px !important; margin: 0px !important; transition-property: none !important; transform: none !important; width: 12px !important; height: 12px !important; display: block !important; z-index: 999998 !important; cursor: sw-resize !important; float: none !important; border-radius: unset !important; pointer-events: auto !important;"></div><div id="cWizudj-1583146979976" class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; top: auto !important; right: 0px !important; bottom: 0px !important; left: auto !important; position: absolute !important; border: 0px !important; min-height: auto !important; min-width: auto !important; max-height: none !important; max-width: none !important; padding: 0px !important; margin: 0px !important; transition-property: none !important; transform: none !important; width: 12px !important; height: 12px !important; display: block !important; z-index: 999999 !important; cursor: se-resize !important; float: none !important; border-radius: unset !important; pointer-events: auto !important;"></div><iframe id="URwERae-1583146980004" src="./multiples of n_files/saved_resource(3).html" frameborder="0" scrolling="no" title="chat widget" class="" style="outline: none !important; visibility: visible !important; resize: none !important; box-shadow: none !important; overflow: visible !important; background: none transparent !important; opacity: 1 !important; position: fixed !important; border: 0px !important; min-height: auto !important; min-width: auto !important; max-height: none !important; max-width: none !important; padding: 0px !important; margin: 0px !important; transition-property: none !important; transform: none !important; width: 378px !important; height: 592px !important; display: none !important; z-index: 999999 !important; cursor: auto !important; float: none !important; border-radius: unset !important; pointer-events: auto !important; bottom: 50px !important; top: auto !important; right: 10px !important; left: auto !important;"></iframe></div>
<script type="text/javascript" id="">window.dataLayer=window.dataLayer||[];function gtag(){dataLayer.push(arguments)}gtag("js",new Date);gtag("config","AW-741910165");</script><iframe name="_hjRemoteVarsFrame" title="_hjRemoteVarsFrame" id="_hjRemoteVarsFrame" src="./multiples of n_files/box-469cf41adb11dc78be68c1ae7f9457a4.html" style="display: none !important; width: 1px !important; height: 1px !important; opacity: 0 !important; pointer-events: none !important;"></iframe></body></html>