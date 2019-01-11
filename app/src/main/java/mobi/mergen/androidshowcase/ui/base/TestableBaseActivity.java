/*
 * Copyright 2018 UGURCAN YILDIRIM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mobi.mergen.androidshowcase.ui.base;

import org.jetbrains.annotations.TestOnly;

import androidx.databinding.ViewDataBinding;
import mobi.mergen.androidshowcase.viewmodel.ViewModelFactory;

public abstract class TestableBaseActivity<V extends ViewDataBinding>
        extends BaseActivity<V> {

    public static final String IS_ON_TESTING = "testing";

    public boolean isOnTesting() {
        return getIntent().getBooleanExtra(IS_ON_TESTING, false);
    }

    @TestOnly
    public abstract void loadFragmentWithViewModelFactory(ViewModelFactory viewModelFactory);
}
