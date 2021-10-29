/*=========================================================================

Library:   IntersonArray

Copyright Kitware Inc. 28 Corporate Drive,
Clifton Park, NY, 12065, USA.

All rights reserved.

Licensed under the Apache License, Version 2.0 ( the "License" );
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

=========================================================================*/
#ifndef _IntersonArrayCxxIntersonClass_h
#define _IntersonArrayCxxIntersonClass_h

// Export library, autogenerated using Cmake
#include "IntersonArrayCxx_Export.h"

#include <string>

// Namespace similar to IntersonArray Namespace from SDK

/*
The library is organized via namespaces; the root is “IntersonArray”,
then “IntersonArray.Controls” to get the methods which access to the
USB probe controls, “IntersonArray.Imaging” is the scan converter, to
build the 2D image B-Scan bitmap from the log-compressed A-Scan
vectors.
*/
namespace IntersonArrayCxx
{
// Wrapper Class for IntersonClass from SDK
class IntersonClassImpl;

// IntersonClass similar to IntersonClass from SDK
class IntersonArrayCxx_EXPORT IntersonClass
{
public:
    IntersonClass();
    ~IntersonClass();

    /*
    Summary: To Get the version of IntersonArray.dll
    Returns: Returns the String of the version.
    */
    std::string Version() const;

private:
    IntersonClass( const IntersonClass &);
    void operator=( const IntersonClass &);

    // Add the wrapper to the main class to use dll function in C#
    IntersonClassImpl *Impl;
};

} // end namespace IntersonArrayCxx

#endif // _IntersonArrayCxxIntersonClass_h
